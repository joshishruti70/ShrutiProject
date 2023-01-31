import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HttpClientModule } from '@angular/common/http';
//import { RegistrationComponent } from './components/registration/registration.component';
// import { HomeComponent } from './components/home/home.component';
import { NewEmpComponent } from './components/new-emp/new-emp.component';
import { EMSComponent } from './components/ems/ems.component';
import { SearchComponent } from './components/search/search.component';
import { ViewComponent } from './components/view/view.component';
import { LoginComponent } from './components/login/login.component';
import { RegistrationComponent } from './registration/registration.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    
    NewEmpComponent,
    EMSComponent,
    SearchComponent,
    ViewComponent,
    LoginComponent,
    RegistrationComponent    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
