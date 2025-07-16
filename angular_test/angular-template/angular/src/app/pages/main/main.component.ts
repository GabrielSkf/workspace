import { Component } from '@angular/core';
import { BoardComponent } from '../../components/board/board.component';

@Component({
  selector: 'app-main',
  imports: [BoardComponent],
  templateUrl: './main.component.html',
  styleUrl: './main.component.scss'
})
export class MainComponent {

}
