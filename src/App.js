import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import NavBar from '../src/home/NavBar';
import CarCard from '../src/home/CarCard';
import Footer from '../src/home/Footer';

const App = () => {
  return (
    <div>
      <NavBar />
      <CarCard />
      <Footer />
    </div>
  );
};
export default App;

