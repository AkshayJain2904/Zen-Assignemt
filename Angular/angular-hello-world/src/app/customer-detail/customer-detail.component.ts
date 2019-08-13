import { Component, OnInit, Input } from '@angular/core';
import { Customer } from '../customer';

@Component({
  selector: 'app-customer-detail',
  template:`
  <h2>Name of customer is{{customer.name}}</h2>
  <h3>{{customer.name}}'s birthdate is{{customer.birthDay | date:"longDate"}}</h3> 
  `,
  styles: [`h2 {color:red}`,`h3 {color:blue}`]
})
export class CustomerDetailComponent implements OnInit {

  @Input()
  customer:Customer
  constructor() { }

  ngOnInit() {
  }

}
