import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { DashboardComponent } from './page/dashboard/dashboard.component';
import { LoginComponent } from './page/login/login.component';
import { StudentComponent } from "./page/student/student.component";
import { TeacherComponent } from "./page/teacher/teacher.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, DashboardComponent, LoginComponent, StudentComponent, TeacherComponent, RouterLink],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  public name: string = 'Ruchira';
}
