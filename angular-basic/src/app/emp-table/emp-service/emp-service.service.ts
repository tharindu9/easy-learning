import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmpServiceService {



  employee1 = {
    name : "tharindu",
    age : 24,
    city : "Kurunegala"
  }

  employee2 = {
    name : "Lahiru",
    age : 24,
    city : "Galle"
  }
  employee3 = {
    name : "Kasun",
    age : 25,
    city : "Thissamaharame"
  }
  
  
  
  arr1 : any[] = [this.employee1,this.employee2,this.employee3]

  constructor() { }

  getEmployee(){
    return this.arr1
  }

  addEmployee(employee){
    this.arr1.push(employee)
    console.log(this.arr1[3].name)

  }
}
