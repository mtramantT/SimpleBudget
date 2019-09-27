import { User } from './../../Models/User';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MatDialog, MatDialogRef } from '@angular/material';
import { ExpenseDialogComponent } from '../dialogs/expense-dialog/expense-dialog.component';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  user: User;
  eDialogRef: MatDialogRef<ExpenseDialogComponent>;

  constructor(private router:Router, private eDialog:MatDialog) {
  }

  ngOnInit() {
    // var userIndexKey = localStorage.key(1);
    // this.user = JSON.parse(localStorage.getItem(userIndexKey));
  }

  // get username(){
  //   return this.user.username;
  // }
  
  goToBudget(){
    this.router.navigate(['budget'])
  }

  openEDialog(){
    // const dialogConfig = new MatDialogConfig;
    // dialogConfig.disableClose = true;
    // dialogConfig.autoFocus = true;

    // this.eDialog.open(ExpenseDialogComponent, dialogConfig);

    this.eDialogRef = this.eDialog.open(ExpenseDialogComponent)
  }
}
