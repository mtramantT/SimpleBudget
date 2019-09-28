import { Component, OnInit } from '@angular/core';
import { MatDialogRef } from '@angular/material';
import { FormGroup, FormBuilder } from '@angular/forms';

@Component({
  selector: 'expense-dialog',
  templateUrl: './expense-dialog.component.html',
  styleUrls: ['./expense-dialog.component.css']
})
export class ExpenseDialogComponent implements OnInit {

  form: FormGroup

  constructor(private fb:FormBuilder, private eDialogRef: MatDialogRef<ExpenseDialogComponent>) { }

  ngOnInit() {
    this.form = this.fb.group({
      testField: '',
      testDatepicker: '',
      period: ''
    });
  }

  submit(form) {
    this.eDialogRef.close(`${form.value.testField}`);
  }

}
