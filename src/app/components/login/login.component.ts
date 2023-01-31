import { Component, OnInit } from '@angular/core';
import { EmpServiceService } from 'src/app/emp-service.service';
import { User } from 'src/app/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  

  constructor(private ls:EmpServiceService) { }
//  email:any;
//  password:any;
//  //id:any;
//  b=false;
//  loginuser(data:any):void{
//    this.ls.loginuser(data.value).subscribe((Users:any)=>{this.b=Users});
//   console.log(this.b);
//   console.log(data.value);
//   if(this.b==true){
//     alert("login successfully !!!");
//   }
//   else{
//     alert("login failed !!!");
//   }
// }

us:User = new User();
  loginData(){
    console.log(this.us);
    this.ls.loginuser(this.us).subscribe(_data=>{
      alert("logged in successfully!!");
     // this.router.navigateByUrl('/user');
    },_error=>alert("sorry please check email and password"))
   
  }

  ngOnInit(): void {
  }

}
