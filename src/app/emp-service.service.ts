import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class EmpServiceService {

  constructor(private http:HttpClient) { }
  url1="http://localhost:9091/save";
  url2="http://localhost:9091/employee";
  url3="http://localhost:9091/update"
  url31="http://localhost:9091/update1"
  url32="http://localhost:9091/update2"
  url33="http://localhost:9091/update3"
  url34="http://localhost:9091/update4"
  url35="http://localhost:9091/update5"
  url36="http://localhost:9091/update6"
  url4="http://localhost:9091/delete";
  url5="http://localhost:9091/view";
  url6="http://localhost:9091/login";
  url7="http://localhost:9091/register";
  insertService(data:any){
    return this.http.post(this.url1,data);
  }
  showEmp(){
    return this.http.get(this.url2);
  }
  updateService(data:any){
    return this.http.put(this.url3,data);
  }


  searchService(data : any){
  return this.http.post(this.url5,data);
}


  droprecord(del:any){
    return this.http.post(this.url4,del);
  }

  //  loginuser(data:any){
  //    return this.http.post(this.url6,data);
  //  }

  loginuser(us:User):Observable<object>{
    console.log(us);
     return this.http.post(this.url6,us);
   }

   registerService(data:any){
    return this.http.post(this.url7,data);
   }
}
