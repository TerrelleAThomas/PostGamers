import React, {Component} from "react";
import axios, {Axios} from "axios";
import * as url from "url";
import {render} from "@testing-library/react";

class Home extends Component {
    constructor(props) {
        super(props);
        this.state = {posts: null}
    }

    componentDidMount() {
        const url = "http://localhost:8080/api/post/?limit=10&by=publishedAt&sort=des"

        const getPosts = async () => {
            await  axios.get(url).then((response) => {

                this.setState({posts: response.data.posts});

            }).catch( (err) => {
                console.log(err);
            })
    }

        getPosts().then(null);

    }
}


