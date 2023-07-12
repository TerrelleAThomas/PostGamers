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
        <></>
    );
}