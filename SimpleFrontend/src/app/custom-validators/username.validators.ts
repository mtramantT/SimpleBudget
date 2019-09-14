import { AbstractControl, ValidationErrors } from '@angular/forms';

export class UsernameValidators {

    shouldBeUnique(control:AbstractControl) : ValidationErrors | null {
        setTimeout(() => {
            console.log("ok")
            //TODO: add service call to check username
            return null;
        }, 2000);

        return null;
    }

}