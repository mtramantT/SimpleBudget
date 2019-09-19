import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

baseURL:String = "http://localhost:8080/users";

  constructor(private http:HttpClient) { }

  checkUsername(username:String){
    const url = this.baseURL + "/username" + username;
    this.http.get(url).subscribe(data => {
      return data.toString
    })
  }
}
