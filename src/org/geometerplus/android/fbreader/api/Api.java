/*
 * This code is in the public domain.
 */

package org.geometerplus.android.fbreader.api;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public interface Api {
	// information about fbreader
	String getFBReaderVersion() throws ApiException;

	// preferences information
	List<String> getOptionGroups() throws ApiException;
	List<String> getOptionNames(String group) throws ApiException;
	String getOptionValue(String group, String name) throws ApiException;
	void setOptionValue(String group, String name, String value) throws ApiException;

	// book information for current book
	String getBookLanguage() throws ApiException;
	String getBookTitle() throws ApiException;
	//List<String> getBookAuthors() throws ApiException;
	List<String> getBookTags() throws ApiException;
	String getBookFilePath() throws ApiException;
	String getBookHash() throws ApiException;
	String getBookUniqueId() throws ApiException;
	Date getBookLastTurningTime() throws ApiException;

	// book information for book defined by id
	String getBookLanguage(long id) throws ApiException;
	String getBookTitle(long id) throws ApiException;
	//List<String> getBookAuthors(long id) throws ApiException;
	List<String> getBookTags(long id) throws ApiException;
	String getBookFilePath(long id) throws ApiException;
	String getBookHash(long id) throws ApiException;
	String getBookUniqueId(long id) throws ApiException;
	Date getBookLastTurningTime(long id) throws ApiException;

	//long findBookIdByUniqueId(String uniqueId) throws ApiException;
	//long findBookIdByFilePath(String uniqueId) throws ApiException;

	// text information
	int getParagraphsNumber() throws ApiException;
	int getElementsNumber(int paragraphIndex) throws ApiException;
	String getParagraphText(int paragraphIndex) throws ApiException;
    public List<String> getParagraphWords(int paragraphIndex) throws ApiException;
    public ArrayList<Integer> getParagraphIndices(int paragraphIndex) throws ApiException;

	// page information
	TextPosition getPageStart() throws ApiException;
	TextPosition getPageEnd() throws ApiException;
	boolean isPageEndOfSection() throws ApiException;
	boolean isPageEndOfText() throws ApiException;

	// manage view
	void setPageStart(TextPosition position) throws ApiException;
	void highlightArea(TextPosition start, TextPosition end) throws ApiException;
	void clearHighlighting() throws ApiException;
    public int getBottomMargin() throws ApiException;
    public void setBottomMargin(int value) throws ApiException;
}
