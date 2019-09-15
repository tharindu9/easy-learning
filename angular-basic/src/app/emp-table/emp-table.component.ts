import { Component, OnInit } from '@angular/core';
import {EmpServiceService} from '../emp-table/emp-service/emp-service.service'

@Component({
  selector: 'app-emp-table',
  templateUrl: './emp-table.component.html',
  styleUrls: ['./emp-table.component.css'],
})
export class EmpTableComponent implements OnInit {

  empArr :any[];
 
  constructor(private employeeService : EmpServiceService) {
   
   }

  ngOnInit() {
    this.displayEmployee()
  }

  displayEmployee(){
    this.empArr = this.employeeService.getEmployee();
    
  }

}
