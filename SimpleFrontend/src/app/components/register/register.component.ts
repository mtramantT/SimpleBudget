import { RegisterValidators } from './../../custom-validators/registervalidators';
import { UsernameValidators } from './../../custom-validators/username.validators';
import { FormGroup, FormControl, Validator, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { CommonValidators } from 'src/app/custom-validators/common.validators';

@Component({
  selector: 'register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  form = new FormGroup({
    'username': new FormControl('', [
      Validators.required,
      Validators.minLength(5),
      CommonValidators.cannotContainSpace
    ]),
    'password': new FormControl('', Validators.required),
    'confirmPassword': new FormControl('', Validators.required)
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

  constructor() { }

  ngOnInit() {
  }

}
