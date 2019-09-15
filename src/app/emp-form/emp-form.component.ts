import { Component, OnInit } from '@angular/core';
import {EmpServiceService} from '../emp-table/emp-service/emp-service.service'

@Component({
  selector: 'app-emp-form',
  templateUrl: './emp-form.component.html',
  styleUrls: ['./emp-form.component.css']
})
export class EmpFormComponent implements OnInit {

  employee = {
    name : "",
    age: "",
    city : ""
  }
  
  constructor(private employeeService : EmpServiceService) { }

  ngOnInit() {
  }

  doSomething(){
    if(confirm("Are you sure to insert this record?")){
      this.employeeService.addEmployee(this.employee)
    }
  }
}
