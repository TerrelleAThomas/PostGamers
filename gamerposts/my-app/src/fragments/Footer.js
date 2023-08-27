import React from "react";

function Footer() {
    return (
        <footer className="bg-dark text-center text-white mt-5">

            <div className="container p-4 pb-0">
                <section className="mb-4">
                    <a className="btn btn-outline-light btn-floating m-1" href="#!" role="button"
                    ><i className="fab fa-facebook-f"></i
                    ></a>

                    <a className="btn btn-outline-light btn-floating m-1" href="#!" role="button"
                    ><i className="fab fa-google"></i
                    ></a>
                </section>

            </div>

            <div className="text-center p-3" style={{backgroundColor: "rgba(0, 0, 0, 0.2)"}}>
                &copy; 2023 PostGamers, Inc &nbsp;
                <a className="text-white" href="http://localhost:3000">Blogify </a>
            </div>

        </footer>
    )
}

export default Footer;