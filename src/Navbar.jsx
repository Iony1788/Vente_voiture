import React from 'react'
import { useState } from 'react';
import Button from 'react-bootstrap/Button';
import Offcanvas from 'react-bootstrap/Offcanvas';
import { Form } from 'react-bootstrap';
import Modal from 'react-bootstrap/Modal';
import Col from 'react-bootstrap/Col';
import InputGroup from 'react-bootstrap/InputGroup';
import Row from 'react-bootstrap/Row';
import * as formik from 'formik';
import * as yup from 'yup';
import { FaList } from 'react-icons/fa';

export default function Navbar() {
   

    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);
    const [show, setShow] = useState(false);

    //sign
    const [shows, setShows] = useState(false);

  const handleCloses = () => setShows(false);
  const handleShows = () => setShows(true);

  //form
  const { Formik } = formik;

  const schema = yup.object().shape({
    firstName: yup.string().required(),
    lastName: yup.string().required(),
    username: yup.string().required(),
    city: yup.string().required(),
    state: yup.string().required(),
    zip: yup.string().required(),
    terms: yup.bool().required().oneOf([true], 'Terms must be accepted'),
  });


  return (
    <>
     <div className="row no-gutters fixed-top m-5">
        <Button variant="outline-dark" onClick={handleShow}  style={{
        position:'fixed',width:'60px'
        }}>
        <FaList/>
    </Button>
        <Form className="d-flex mx-5" style={{
            width:'500px'
        }}>
          <Form.Control
            type="search"
            placeholder="Search"
            className="mx-2"
            aria-label="Search"
            
          />
          <Button variant="outline-success">Search</Button>
          <Button variant="danger" onClick={handleShows} className="mx-3">
            Login
          </Button>
        </Form>
    </div>
    <Modal
  show={shows}
  onHide={handleCloses}
  backdrop="static"
  keyboard={false}
>
  <Modal.Header closeButton>
    <Modal.Title>Connecter</Modal.Title>
  </Modal.Header>
  <Modal.Body>
    <div className='p-2'>
      <Formik
        validationSchema={schema}
        onSubmit={console.log}
        initialValues={{
          email: 'rakoto@gmail.com',
          mdp: '1234',
          username: '',
          city: '',
          state: '',
          zip: '',
          terms: false,
        }}
      >
        {({ handleSubmit, handleChange, values, touched, errors }) => (
          <Form noValidate onSubmit={handleSubmit}>
            <Row className="mb-3">
              <Form.Group as={Col} md="4" controlId="validationFormik01">
                <Form.Label>Email</Form.Label>
                <Form.Control
                  type="email" // Type doit être 'email' pour l'adresse email
                  name="email"
                  value={values.email}
                  onChange={handleChange}
                  isValid={touched.email && !errors.email}
                  placeholder="iony@gmail.com" // Ajout du placeholder
                />
                <Form.Control.Feedback type="invalid">
                  {errors.email}
                </Form.Control.Feedback>
              </Form.Group>
              <Form.Group as={Col} md="4" controlId="validationFormik02">
                <Form.Label>Mot de passe</Form.Label>
                <Form.Control
                  type="password" // Type doit être 'password' pour un mot de passe
                  name="mdp"
                  value={values.mdp}
                  onChange={handleChange}
                  isValid={touched.mdp && !errors.mdp}
                  placeholder="1234" // Ajout du placeholder
                />
                <Form.Control.Feedback type="invalid">
                  {errors.mdp}
                </Form.Control.Feedback>
              </Form.Group>
            </Row>
            <Button type="submit">Se connecter</Button>
          </Form>
        )}
      </Formik>
    </div>
  </Modal.Body>
</Modal>


    <Offcanvas show={show} onHide={handleClose}>
        <Offcanvas.Header closeButton>
          <Offcanvas.Title>Fiaranay</Offcanvas.Title>
        </Offcanvas.Header>
        <Offcanvas.Body>
            
        <nav className="col-lg-3 navbar-vertical">
          <ul className="navbar-nav">
            <li className="nav-item">
              <a className="nav-link text-dark" href="/">Accueil</a>
            </li>
            <li className="nav-item dropdown">
              <a className="nav-link dropdown-toggle text-dark" href="/" id="navbarDropdown" role="button" aria-haspopup="true" aria-expanded="false">
                Catégories
              </a>
              <div className="dropdown-menu" aria-labelledby="navbarDropdown">
                <a className="dropdown-item text-dark" href="/suv">SUV</a>
                <a className="dropdown-item text-dark" href="/berline">Berline</a>
                <a className="dropdown-item text-dark" href="/sport">Voitures de sport</a>
              </div>
            </li>
            <li className="nav-item">
              <a className="nav-link text-dark" href="/about">À propos</a>
            </li>
            <li className="nav-item">
              <a className="nav-link text-dark" href="/services">Services</a>
            </li>
            <li className="nav-item">
              <a className="nav-link text-dark" href="/contact">Contact</a>
            </li>
          </ul>
        </nav>
        </Offcanvas.Body>
      </Offcanvas>

      

    </>
  )
}
