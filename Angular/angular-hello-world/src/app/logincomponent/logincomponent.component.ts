import { Component, OnInit } from '@angular/core';
import { User } from '../user';

@Component({
  selector: 'app-logincomponent',
  templateUrl: './logincomponent.component.html',
  styleUrls: ['./logincomponent.component.css']
})
export class LogincomponentComponent implements OnInit {
  user:User;

  constructor() {
    this.user=new User();
   }

  ngOnInit() {
  }
  validate(){
    console.log(this.user);
  }

}
