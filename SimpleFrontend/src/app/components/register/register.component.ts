import { AuthenticationService } from './../../services/authentication.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { CommonValidators } from 'src/app/custom-validators/common.validators';
import { User } from 'src/app/Models/User';

@Component({
  selector: 'register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user:User;
  
  form = new FormGroup({
    'username': new FormControl('', [
      Validators.required,
      Validators.minLength(5),
      CommonValidators.cannotContainSpace
    ]),
    'password': new FormControl('', Validators.required),
    'confirmPassword': new FormControl('', Validators.required),
    'firstName': new FormControl(),
    'lastName': new FormControl(),
    'email': new FormControl()
  });

  get username() {
    return this.form.get('username')
  }
  get password() {
    return this.form.get('password')
  }
  get confirmPassword() {
    return this.form.get('confirmPassword')
  }
  get firstName(){
    return this.form.get('firstName')
  }
  get lastName(){
    return this.form.get('lastName')
  }
  get email(){
    return this.form.get('email')
  }

  register(){
    if(this.password === this.confirmPassword)
      this.user = new User(
        this.username.value,
        this.password.value,
        null,
        this.firstName.value,
        this.lastName.value,
        this.email.value
      );
      this.as.register(this.user);
  }
  constructor(private as:AuthenticationService) { }

  ngOnInit() {
  }

}
