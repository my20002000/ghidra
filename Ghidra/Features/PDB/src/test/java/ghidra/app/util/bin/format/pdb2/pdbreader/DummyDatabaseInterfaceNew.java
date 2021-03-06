/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.app.util.bin.format.pdb2.pdbreader;

import ghidra.app.util.bin.format.pdb2.pdbreader.AbstractPdb;
import ghidra.app.util.bin.format.pdb2.pdbreader.DatabaseInterfaceNew;

/**
 * This class is an extension of {@link DatabaseInterfaceNew}, whose sole purpose
 *  is to allow for testing of internal components of {@link AbstractPdb} classes.  It is not
 *  part of the production PDB Reader.
 */
class DummyDatabaseInterfaceNew extends DatabaseInterfaceNew {

	//==============================================================================================
	// Package-Protected Internals
	//==============================================================================================
	/**
	 * IMPORTANT: This method is for testing only.  It allows us to set a basic object.
	 *  Note: not all values are initialized.  
	 * @param pdb The AbstractPdb foundation for the DatabaseInterface.
	 */
	DummyDatabaseInterfaceNew(AbstractPdb pdb) {
		super(pdb, -1);
	}

}
