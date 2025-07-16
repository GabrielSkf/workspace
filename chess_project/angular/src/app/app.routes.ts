import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { DefaultLayoutComponent } from './components/default-layout/default-layout.component';
import { GameComponent } from './pages/game/game.component';

export const routes: Routes = [{
    path: "",
    component: GameComponent
}];
