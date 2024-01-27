import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import NavBar from '../src/home/NavBar';
import Details from '../src/home/Details';
import Footer from '../src/home/Footer';

const AppDetails = () => {
  return (
    <div>
      <NavBar />
      <Details />
      <Footer />
    </div>
  );
};
export default AppDetails;