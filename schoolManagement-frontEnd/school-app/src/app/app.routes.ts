import { Routes } from '@angular/router';
import { LoginComponent } from './page/login/login.component';
import { DashboardComponent } from './page/dashboard/dashboard.component';
import { StudentComponent } from './page/student/student.component';
import { TeacherComponent } from './page/teacher/teacher.component';

export const routes: Routes = [
    {
        path: "login",
        component: LoginComponent
    },
    {
        path: "student",
        component: StudentComponent
    },
    {
        path: "teacher",
        component: TeacherComponent
    }
];
