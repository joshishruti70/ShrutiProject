import { Component, OnInit } from '@angular/core';
import { EmpServiceService } from '../emp-service.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor(private is:EmpServiceService) { }
  registerData(insert:any){
    this.is.registerService(insert.value).subscribe();
  }

  ngOnInit(): void {
  }

}
