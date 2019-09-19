import { AuthenticationService } from './../services/authentication.service';
import { AbstractControl, ValidationErrors } from '@angular/forms';

export class UsernameValidators {

    as:AuthenticationService

    // static shouldBeUnique(control:AbstractControl, username:string) : ValidationErrors | null {
    //     setTimeout(() => {
    //         console.log("ok")
    //         //TODO: add service call to check username
    //         var value = this.as.checkUsername(username);
    //         if (value === null)
    //             return null;
    //         return {shouldBeUnique: true}
    //     }, 2000);

    //     return null;
    // }

}