import React, {useContext, useEffect, useRef, useState} from "react";
import {useNavigate} from "react-router-dom";
import {AuthContext} from "../AuthContext";
import background from "./Background.jpg";
function SignUp () {

    const context = useContext(AuthContext);
    const emailRef = useRef("");
    const passwordRef = useRef("");
    const firstnameRef = useRef("");
    const lastnameRef = useRef("");
    const universitynameRef = useRef("");
    const [errors, setErrors] = useState("");

    let navigate = useNavigate();


    useEffect(() => {
        window.document.body.classList.add("text-center");

    }, [])

    async function handleSubmit(event) {

        event.preventDefault();

        if (!context || typeof context.SignUp !== "function") {
            console.error("Invalid context or sign up")
            return;
            console.log("Step1")
        }
        let x = context.SignUp(emailRef.current.value, passwordRef.current.value,
            firstnameRef.current.value, lastnameRef.current.value,
            universitynameRef.current.value);
        console.log(context.currentUser)
        if (x != null) {
            navigate("/Search")
        } else {
            setErrors(context.errors);
            console.log("Error")
        }
        console.log("Mounted")
    }

    return (

        <main className="form-signin w-50 h-50 m-auto">
            <form onSubmit={handleSubmit}>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <img className="mb-4"  alt="" width="324"/>
                <h1 className="h3 mb-3 fw-normal">PostGamers</h1>
                <br></br>
                <div className="form-floating">
                    <input type="text" className="form-control" id="floatingInput" placeholder="First Name"
                           ref={firstnameRef}/>
                    <label htmlFor="floatingInput">First Name</label>
                </div>
                <br></br>
                <div className="form-floating">
                    <input type="text" className="form-control" id="floatingInput" placeholder="Last Name"
                           ref={lastnameRef}/>
                    <label htmlFor="floatingInput">Last Name</label>
                </div>
                <br></br>
                <div className="form-floating">
                    <input type="text" className="form-control" id="floatingInput" placeholder="University"
                           ref={universitynameRef}/>
                    <label htmlFor="floatingInput">University</label>
                </div>
                <br></br>
                <div className="form-floating">
                    <input type="email" className="form-control" id="floatingInput" placeholder="name@example.com"
                           ref={emailRef}/>
                    <label htmlFor="floatingInput">Email address</label>
                </div>
                <br></br>
                <div className="form-floating">
                    <input type="password" className="form-control" id="floatingPassword" placeholder="Password"
                           ref={passwordRef}/>
                    <label htmlFor="floatingPassword">Password</label>
                </div>
                <br></br>
                <div className="mb-3 form-check">
                    <input type="checkbox" className="form-check-input" id="exampleCheck1"/>
                    <label className="form-check-label text-white" htmlFor="exampleCheck1">By signing up, you agree to our terms and regulations</label>
                </div>

                <button className="mt-3 w-100 btn btn-lg btn-primary" type="submit">Sign Up</button>
            </form>
            <br></br>
            <br></br>
            <br></br>
            <br></br>
        </main>
    );
}