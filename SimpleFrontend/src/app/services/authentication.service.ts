import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { isNull } from '@angular/compiler/src/output/output_ast';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

baseURL:String = "http://localhost:8080/users";

  constructor(private http:HttpClient) { }

  checkUsername(username:String){
    const url = this.baseURL + "/" + username;
    this.http.get(url).subscribe(data => {
      return data.toString
    })
  }
}
