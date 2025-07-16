import { Component } from '@angular/core';
import { DefaultLoginLayout } from '../../components/default-login-layout/default-login-layout';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { PrimaryInput } from '../../components/primary-input/primary-input';
import { Router, RouterModule } from '@angular/router';
// import { LoginServices } from '../../services/login'

@Component({
  selector: 'app-login',
  imports: [
    DefaultLoginLayout,
    ReactiveFormsModule,
    PrimaryInput,
    RouterModule
  ],
  providers: [
    Login
  ],
  templateUrl: './login.html',
  styleUrl: './login.scss'
})
export class Login {
  loginForm!: FormGroup;

  constructor(
    private router: Router,
    private loginService: LoginService
  ) {
    this.loginForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', [Validators.required, Validators.minLength(6)])
    })
  }

  submit() {
    this.loginService.login(
      this.loginForm.value.email, 
      this.loginForm.value.password)
  }

  navigate() {
    this.router.navigate(["/signup"]);
  }
}
