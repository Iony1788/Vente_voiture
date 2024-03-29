// App.js
import React from 'react';
import { useState } from 'react';
import Button from 'react-bootstrap/Button';
import Modal from 'react-bootstrap/Modal';
import Navbar from './Navbar';
import sary from './img/car1.jpg';
import sary2 from './img/car2.jpg';
import sary3 from './img/car3.jpg';
import sary4 from './img/car4.jpg';
import './App.css';

function App() {
  
  const [show, setShow] = useState(false);

  const handleClose = () => setShow(false);
  const handleShow = () => setShow(true);
   // ajouer voiture
   
  const [showes, setShowes] = useState(false);

  const handleClosees = () => setShowes(false);
  const handleShowes = () => setShowes(true);

  return (
        <>
         <Modal show={showes} onHide={handleClosees}>
        <Modal.Header closeButton>
          <Modal.Title>Ajouter Voiture</Modal.Title>
        </Modal.Header>
        <Modal.Body>
          <div className='p-2'>
            <form method='get d-inline'>
              <input className='p-3'  placeholder='Nom'/>
              <input className='p-3'  placeholder='Marque'/>
              <input className='p-3'  placeholder='date'/>
              <input className='p-3'  placeholder='Prix'/>
              <input className='p-3'  placeholder='lien image'/>
              
            </form>
          </div>
        </Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={handleClosees}>
            Close
          </Button>
          <Button variant="primary" onClick={handleClosees}>
            Ajouter
          </Button>
        </Modal.Footer>
      </Modal>



    <Modal show={show} onHide={handleClose}>
        <Modal.Header closeButton>
          <Modal.Title>Toyota Camry</Modal.Title>
        </Modal.Header>
        <Modal.Body>
            <img src={sary} alt='' className='img-fluid'/>
          <hr/>
          <h5>
            Description:
          </h5>
          <p> Toyota sortie en 2016 </p><h5>
            Prix
          </h5>
          <p> 2000 </p>
        </Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={handleClose}>
            Close
          </Button>
          <Button variant="primary" onClick={handleClose}>
            Contacter
          </Button>
        </Modal.Footer>
      </Modal>
  <div className="row no-gutters d-flex" id="font">
      <Navbar/>
      
      
     
    </div>  
            
    <div className="container pt-5">

    
      <div className="row">
        
        <main className='col-lg-1'></main>
        <main className="col-lg-10 pt-5">

        {/* Cadre voiture */}
          <ul className="car-list">
            <li className="car-item">
              <div className="car-item-content">
                <p><img src={sary2} alt='' style={{ width: '50%', height: '0%' }}/></p>
                  <h3>Toyota Camry</h3>
                  <p>Prix: 30,000$</p>
                  <Button variant="outline-info" onClick={handleShow}>
                    Voir détails
                  </Button>
              </div>
             
            </li>
             <li className="car-item">
              <div className="car-item-content">
              <p><img src={sary3} alt='' style={{ width: '50%', height: '0%' }}/></p>
                <h3>Ford</h3>
                <p>Prix: 25,000$</p>
                <Button variant="outline-info" onClick={handleShow}>
                  Voir détails
                </Button>
              </div>
            </li>
            <li className="car-item">
              <div className="car-item-content">
              <p><img src={sary4} alt='' style={{ width: '50%', height: '0%' }}/></p>
                <h3>Polo</h3>
                <p>Prix: 22,000$</p>
                <Button variant="outline-info" onClick={handleShow}>
                  Voir détails
                </Button>
              </div>
            </li>
            <li className="car-item">
              <div className="car-item-content">
              <p><img src={sary} alt='' style={{ width: '50%', height: '0%' }}/></p>
                <h3>Rang Rover</h3>
                <p>Prix: 30,000$</p>
                <Button variant="outline-info" onClick={handleShow}>
                  Voir détails
                </Button>
              </div>
            </li> 
           {/* fin cadre voiture */}
                  
            
      <Button variant="danger" onClick={handleShowes} size='lg'>
        Ajouter Voiture
      </Button>



          </ul>
        </main>
      </div>

      <footer className="footer">
        <p>© 2024 Tous droits réservés.</p>
      </footer>
    </div>
        </>
  );
}

export default App;
