import { User } from './../../Models/User';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private user:User) {
  }

  ngOnInit() {
    var userIndexKey = localStorage.key(1);
    this.user = JSON.parse(localStorage.getItem(userIndexKey));
  }

  get username(){
    return this.user.username;
  }
  
}
