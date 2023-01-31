import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EMSComponent } from './components/ems/ems.component';
import { LoginComponent } from './components/login/login.component';
// import { HomeComponent } from './components/home/home.component';
//import { FormsModule } from '@angular/forms';
//import { LoginComponent } from './components/login/login.component';
import { NewEmpComponent } from './components/new-emp/new-emp.component';
import { SearchComponent } from './components/search/search.component';
import { ViewComponent } from './components/view/view.component';
import { RegistrationComponent } from './registration/registration.component';


const routes: Routes = [
{path:'login',component:LoginComponent},
{path:'ems',component:EMSComponent},
{path:'view',component:ViewComponent},
{path:'newEmp',component:NewEmpComponent},
{path:'search',component:SearchComponent},
{path:'registration',component:RegistrationComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
