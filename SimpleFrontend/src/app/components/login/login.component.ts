import { AuthenticationService } from './../../services/authentication.service';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators} from '@angular/forms';
import { Router } from '@angular/router';
import { User } from 'src/app/Models/User';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private as:AuthenticationService, private router:Router) { }

  ngOnInit() {
  }
  
  form = new FormGroup({
    username: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required)
  });

  login(){  
    this.as.login(this.username.value, this.password.value)
      .subscribe(data => {
        if(data != null)
          var user = new User(
            data.username, 
            data.password,
            data.userId,
            data.firstName,
            data.lastName,
            data.email)
          localStorage.setItem(user.username, JSON.stringify(user))
          this.router.navigate(['home'])
        .catch()
      })
  }

  navigateRegister(){
    this.router.navigate(['register'])
  }
  test(){
    console.log("test function:")
    this.as.test();
  }
  
  get username(){
    return this.form.get('username');
  }
  get password(){
    return this.form.get('password')
  }

}
