import { User } from './../../Models/User';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  user: User;
  constructor() {
  }

  ngOnInit() {
    // var userIndexKey = localStorage.key(1);
    // this.user = JSON.parse(localStorage.getItem(userIndexKey));
  }

  // get username(){
  //   return this.user.username;
  // }
  
}
