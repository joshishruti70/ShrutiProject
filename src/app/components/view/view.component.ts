import { Component, OnInit } from '@angular/core';
import { EmpServiceService } from '../../emp-service.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  constructor(private es:EmpServiceService) {
    this.viewEmp1();
   }
   viewEmp:any;
  viewEmp1(){
    this.es.showEmp().subscribe((resp:any)=>(this.viewEmp=resp));
  }

  deleteData(del:any){
    this.es.droprecord(del.value).subscribe();
    alert("Record Deleted !!!");

  }
  updateData(update:any){
    this.es.updateService(update.value).subscribe();
    alert("Record Updated !!!");

  }
  
ngOnInit(): void {
  }

}
