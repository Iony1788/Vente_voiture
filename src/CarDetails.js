// CarDetails.js
import React from 'react';
import './CarDetails.css'; 

function CarDetails() {
  return (
    <div className="car-details-container">
      <div className="car-details-content">
        <img src="chemin/de/l/image.jpg" alt="Voiture" className="car-image" />
        <div className="car-info">
          <h2>Nom de la Voiture</h2>
          <p>Description de la Voiture</p>
          <p>Prix: $XX,XXX</p>
          <a href="/contact" className="contact-button">Contactez-nous</a>
        </div>
      </div>
    </div>
  );
}

export default CarDetails;
