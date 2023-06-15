<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
    <c:import url="header.jsp"/>
    <div class="container-fluid p-5">
        <h1 class="text-center">About</h1>
        <p class="text-center"><a href="https://github.com/jpdhmc/encounter-tracker">View the project on Github!</a></p>
        <p class="text-center">The Combat Companion (aka the encounter tracker) is an online tool I made as an independent project for the Enterprise Java course at Madison College. It can be used for creating and tracking Dungeons and Dragons encounters! This includes:</p>
        <ul class="text-center list-group">
            <li class="list-group-item">Creating user accounts and storing their data in a MySQL database</li>
            <li class="list-group-item">Creating encounters that will contain creatures</li>
            <li class="list-group-item">Creating creatures that have many different attributes associated with them</li>
            <li class="list-group-item">Having the option to either create a creature yourself or search the Open5e API</li>
            <li class="list-group-item">Saving creatures to a user's account for use in multiple encounters (so you don't have to recreate them every time)</li>
        </ul>
        <div class="row bg-light">
            <div class="col d-flex align-items-center justify-content-center">
                <p>A user will first have the opportunity to create an account or log in using Amazon Cognito functionality.</p>
                <p>(Images may be clicked on for a better view)</p>
            </div>
            <div class="col d-flex align-items-center justify-content-center">
                <button type="button" data-bs-toggle="modal" data-bs-target="#modal1"><img class="img-fluid" src="images/home.JPG" alt="The home page" style="width:960px;height:500px;"></button>
                <div class="modal fade" id="modal1">
                    <div class="modal-dialog modal-xl">
                        <div class="modal-content">
                            <div class="modal-body">
                                <img src="images/home.JPG" alt="The home page" style="width: 100%;">
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col d-flex align-items-center justify-content-center">
                <p>Once logged in, you may view your encounters. Every user has a creature collection for storing and reusing creatures as desired. We can also create a new encounter.</p>
            </div>
            <div class="col d-flex align-items-center justify-content-center">
                <button type="button" data-bs-toggle="modal" data-bs-target="#modal2"><img class="img-fluid" src="images/viewEncounters.JPG" alt="View encounters page" style="width:960px;height:500px;"></button>
                <div class="modal fade" id="modal2">
                    <div class="modal-dialog modal-xl">
                        <div class="modal-content">
                            <div class="modal-body">
                                <img src="images/viewEncounters.JPG" alt="View encounters" style="width: 100%;">
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row bg-light">
            <div class="col d-flex align-items-center justify-content-center">
                <p>Now that we have an encounter, we can create creatures to populate it. First, I will create one from scratch.</p>
            </div>
            <div class="col d-flex align-items-center justify-content-center">
                <button type="button" data-bs-toggle="modal" data-bs-target="#modal3"><img class="img-fluid" src="images/createdEncounter.JPG" alt="View encounter page" style="width:960px;height:500px;"></button>
                <div class="modal fade" id="modal3">
                    <div class="modal-dialog modal-xl">
                        <div class="modal-content">
                            <div class="modal-body">
                                <img src="images/createdEncounter.JPG" alt="View encounter page" style="width: 100%;">
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col d-flex align-items-center justify-content-center">
                <p>When filling out the form with your desired creature details, you will have an option to add it to your collection.</p>
            </div>
            <div class="col d-flex align-items-center justify-content-center">
                <button type="button" data-bs-toggle="modal" data-bs-target="#modal4"><img class="img-fluid" src="images/createCreature.JPG" alt="Creating a creature" style="width:960px;height:500px;"></button>
                <div class="modal fade" id="modal4">
                    <div class="modal-dialog modal-xl">
                        <div class="modal-content">
                            <div class="modal-body">
                                <img src="images/createCreature.JPG" alt="Creating a creature" style="width: 100%;">
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row bg-light">
            <div class="col d-flex align-items-center justify-content-center">
                <p>Since we added our scary monster to our collection, we are able to recreate it easily if we want. Next I will demonstrate searching the Open5e API for a creature.</p>
            </div>
            <div class="col d-flex align-items-center justify-content-center">
                <button type="button" data-bs-toggle="modal" data-bs-target="#modal5"><img class="img-fluid" src="images/createFromCollection.JPG" alt="Creating a creature" style="width:960px;height:500px;"></button>
                <div class="modal fade" id="modal5">
                    <div class="modal-dialog modal-xl">
                        <div class="modal-content">
                            <div class="modal-body">
                                <img src="images/createFromCollection.JPG" alt="Creating a creature" style="width: 100%;">
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col d-flex align-items-center justify-content-center">
                <p>I entered the search term "dragon" and was returned a table of matching creatures with the option to add them to my encounter.</p>
            </div>
            <div class="col d-flex align-items-center justify-content-center">
                <button type="button" data-bs-toggle="modal" data-bs-target="#modal6"><img class="img-fluid" src="images/searchApi.JPG" alt="Searching the open5e api" style="width:960px;height:500px;"></button>
                <div class="modal fade" id="modal6">
                    <div class="modal-dialog modal-xl">
                        <div class="modal-content">
                            <div class="modal-body">
                                <img src="images/searchApi.JPG" alt="Searching the open5e api" style="width: 100%;">
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row bg-light">
            <div class="col d-flex align-items-center justify-content-center">
                <p>And here is the added dragon in our encounter!</p>
            </div>
            <div class="col d-flex align-items-center justify-content-center">
                <button type="button" data-bs-toggle="modal" data-bs-target="#modal7"><img class="img-fluid" src="images/createdFromApi.JPG" alt="Created a creature from the API" style="width:960px;height:500px;"></button>
                <div class="modal fade" id="modal7">
                    <div class="modal-dialog modal-xl">
                        <div class="modal-content">
                            <div class="modal-body">
                                <img src="images/createdFromApi.JPG" alt="Created a creature from the API" style="width: 100%;">
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
<c:import url="footer.jsp"/>