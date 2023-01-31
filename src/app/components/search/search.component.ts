import { Component, OnInit } from '@angular/core';
import { EmpServiceService } from 'src/app/emp-service.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent  {

  constructor(private es:EmpServiceService) { 
    // this.searchData();
  }
  searchEmp1:any;
  searchData(data:any){
  this.es.searchService(data.value).subscribe((resp:any)=>{this.searchEmp1=resp});
}
   

}
