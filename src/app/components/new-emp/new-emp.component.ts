import { Component, OnInit } from '@angular/core';
import { EmpServiceService } from 'src/app/emp-service.service';

@Component({
  selector: 'app-new-emp',
  templateUrl: './new-emp.component.html',
  styleUrls: ['./new-emp.component.css']
})
export class NewEmpComponent implements OnInit {

  constructor(private is:EmpServiceService) { }
  insertData(insert:any){
    this.is.insertService(insert.value).subscribe();
    alert("Employee added successfully !!!");

  }

  ngOnInit(): void {
  }

}
