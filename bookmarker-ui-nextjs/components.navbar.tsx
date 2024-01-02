import React from 'react';

const Navbar = () => (
    <header>
        <nav className="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <div className="container-fluid">
                <a className="navbar-brand" href="#">Bookmarker</a>
                <button className="navbar-toggler" type="button"
                data-bs-toggle="collapse" data-bs-target="#navbarCollapse"
                aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>

                <div className="collapse navbar-collapse" id="navbarCollapse">
                    <ul className="navbar-nav ms-auto">
                        <li className="nav-item">
                            <a className="nav-link"  href="#">Add Bookmark</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

);

export default Navbar;