package expo.modules.contacts.next.records.contact;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.records.fields.AddressRecord;
import expo.modules.contacts.next.records.fields.DateRecord;
import expo.modules.contacts.next.records.fields.EmailRecord;
import expo.modules.contacts.next.records.fields.ExtraNameRecord;
import expo.modules.contacts.next.records.fields.PhoneRecord;
import expo.modules.contacts.next.records.fields.RelationRecord;
import expo.modules.contacts.next.records.fields.UrlAddressRecord;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.ValueOrUndefined;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0004\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\"\b\u0002\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0018\u00010\u00150\u0003\u0012\"\b\u0002\u0010\u0019\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0016\u0018\u00010\u00150\u0003\u0012\"\b\u0002\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0016\u0018\u00010\u00150\u0003\u0012\"\b\u0002\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0016\u0018\u00010\u00150\u0003\u0012\"\b\u0002\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0016\u0018\u00010\u00150\u0003\u0012\"\b\u0002\u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0016\u0018\u00010\u00150\u0003\u0012\"\b\u0002\u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0016\u0018\u00010\u00150\u0003¢\u0006\u0004\b+\u0010,J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J#\u0010i\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0018\u00010\u00150\u0003HÆ\u0003J#\u0010j\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0016\u0018\u00010\u00150\u0003HÆ\u0003J#\u0010k\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0016\u0018\u00010\u00150\u0003HÆ\u0003J#\u0010l\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0016\u0018\u00010\u00150\u0003HÆ\u0003J#\u0010m\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0016\u0018\u00010\u00150\u0003HÆ\u0003J#\u0010n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0016\u0018\u00010\u00150\u0003HÆ\u0003J#\u0010o\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0016\u0018\u00010\u00150\u0003HÆ\u0003J\u0091\u0004\u0010p\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\"\b\u0002\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0018\u00010\u00150\u00032\"\b\u0002\u0010\u0019\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0016\u0018\u00010\u00150\u00032\"\b\u0002\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0016\u0018\u00010\u00150\u00032\"\b\u0002\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0016\u0018\u00010\u00150\u00032\"\b\u0002\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0016\u0018\u00010\u00150\u00032\"\b\u0002\u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0016\u0018\u00010\u00150\u00032\"\b\u0002\u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0016\u0018\u00010\u00150\u0003HÆ\u0001J\u0013\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010sHÖ\u0003J\t\u0010t\u001a\u00020uHÖ\u0001J\t\u0010v\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010.\u001a\u0004\b\u0002\u0010/R$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010.\u001a\u0004\b1\u0010/R$\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010.\u001a\u0004\b3\u0010/R$\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010.\u001a\u0004\b5\u0010/R$\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010.\u001a\u0004\b7\u0010/R$\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010.\u001a\u0004\b9\u0010/R$\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010.\u001a\u0004\b;\u0010/R$\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010.\u001a\u0004\b=\u0010/R$\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010.\u001a\u0004\b?\u0010/R$\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010.\u001a\u0004\bA\u0010/R$\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010.\u001a\u0004\bC\u0010/R$\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010.\u001a\u0004\bE\u0010/R$\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010.\u001a\u0004\bG\u0010/R$\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010.\u001a\u0004\bI\u0010/R$\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010.\u001a\u0004\bK\u0010/R6\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010.\u001a\u0004\bM\u0010/R6\u0010\u0019\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010.\u001a\u0004\bO\u0010/R6\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010.\u001a\u0004\bQ\u0010/R6\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010.\u001a\u0004\bS\u0010/R6\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u0010.\u001a\u0004\bU\u0010/R6\u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010.\u001a\u0004\bW\u0010/R6\u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u0010.\u001a\u0004\bY\u0010/¨\u0006w"}, d2 = {"Lexpo/modules/contacts/next/records/contact/PatchContactRecord;", "Lexpo/modules/kotlin/records/Record;", "isFavourite", "Lexpo/modules/kotlin/types/ValueOrUndefined;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "givenName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "middleName", "familyName", "prefix", "suffix", "phoneticGivenName", "phoneticMiddleName", "phoneticFamilyName", "company", "department", "jobTitle", "phoneticCompanyName", "note", "image", "emails", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/Either;", "Lexpo/modules/contacts/next/records/fields/EmailRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/EmailRecord$New;", "phones", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;", "dates", "Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/DateRecord$New;", "addresses", "Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/AddressRecord$New;", "relations", "Lexpo/modules/contacts/next/records/fields/RelationRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/RelationRecord$New;", "urlAddresses", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;", "extraNames", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;", "<init>", "(Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;)V", "isFavourite$annotations", "()V", "()Lexpo/modules/kotlin/types/ValueOrUndefined;", "getGivenName$annotations", "getGivenName", "getMiddleName$annotations", "getMiddleName", "getFamilyName$annotations", "getFamilyName", "getPrefix$annotations", "getPrefix", "getSuffix$annotations", "getSuffix", "getPhoneticGivenName$annotations", "getPhoneticGivenName", "getPhoneticMiddleName$annotations", "getPhoneticMiddleName", "getPhoneticFamilyName$annotations", "getPhoneticFamilyName", "getCompany$annotations", "getCompany", "getDepartment$annotations", "getDepartment", "getJobTitle$annotations", "getJobTitle", "getPhoneticCompanyName$annotations", "getPhoneticCompanyName", "getNote$annotations", "getNote", "getImage$annotations", "getImage", "getEmails$annotations", "getEmails", "getPhones$annotations", "getPhones", "getDates$annotations", "getDates", "getAddresses$annotations", "getAddresses", "getRelations$annotations", "getRelations", "getUrlAddresses$annotations", "getUrlAddresses", "getExtraNames$annotations", "getExtraNames", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PatchContactRecord implements Record {
    private final ValueOrUndefined<List<Either<AddressRecord.Patch, AddressRecord.New>>> addresses;
    private final ValueOrUndefined<String> company;
    private final ValueOrUndefined<List<Either<DateRecord.Patch, DateRecord.New>>> dates;
    private final ValueOrUndefined<String> department;
    private final ValueOrUndefined<List<Either<EmailRecord.Patch, EmailRecord.New>>> emails;
    private final ValueOrUndefined<List<Either<ExtraNameRecord.Patch, ExtraNameRecord.New>>> extraNames;
    private final ValueOrUndefined<String> familyName;
    private final ValueOrUndefined<String> givenName;
    private final ValueOrUndefined<String> image;
    private final ValueOrUndefined<Boolean> isFavourite;
    private final ValueOrUndefined<String> jobTitle;
    private final ValueOrUndefined<String> middleName;
    private final ValueOrUndefined<String> note;
    private final ValueOrUndefined<List<Either<PhoneRecord.Patch, PhoneRecord.New>>> phones;
    private final ValueOrUndefined<String> phoneticCompanyName;
    private final ValueOrUndefined<String> phoneticFamilyName;
    private final ValueOrUndefined<String> phoneticGivenName;
    private final ValueOrUndefined<String> phoneticMiddleName;
    private final ValueOrUndefined<String> prefix;
    private final ValueOrUndefined<List<Either<RelationRecord.Patch, RelationRecord.New>>> relations;
    private final ValueOrUndefined<String> suffix;
    private final ValueOrUndefined<List<Either<UrlAddressRecord.Patch, UrlAddressRecord.New>>> urlAddresses;

    public PatchContactRecord() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PatchContactRecord copy$default(PatchContactRecord patchContactRecord, ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, ValueOrUndefined valueOrUndefined3, ValueOrUndefined valueOrUndefined4, ValueOrUndefined valueOrUndefined5, ValueOrUndefined valueOrUndefined6, ValueOrUndefined valueOrUndefined7, ValueOrUndefined valueOrUndefined8, ValueOrUndefined valueOrUndefined9, ValueOrUndefined valueOrUndefined10, ValueOrUndefined valueOrUndefined11, ValueOrUndefined valueOrUndefined12, ValueOrUndefined valueOrUndefined13, ValueOrUndefined valueOrUndefined14, ValueOrUndefined valueOrUndefined15, ValueOrUndefined valueOrUndefined16, ValueOrUndefined valueOrUndefined17, ValueOrUndefined valueOrUndefined18, ValueOrUndefined valueOrUndefined19, ValueOrUndefined valueOrUndefined20, ValueOrUndefined valueOrUndefined21, ValueOrUndefined valueOrUndefined22, int i10, Object obj) {
        ValueOrUndefined valueOrUndefined23;
        ValueOrUndefined valueOrUndefined24;
        ValueOrUndefined valueOrUndefined25 = (i10 & 1) != 0 ? patchContactRecord.isFavourite : valueOrUndefined;
        ValueOrUndefined valueOrUndefined26 = (i10 & 2) != 0 ? patchContactRecord.givenName : valueOrUndefined2;
        ValueOrUndefined valueOrUndefined27 = (i10 & 4) != 0 ? patchContactRecord.middleName : valueOrUndefined3;
        ValueOrUndefined valueOrUndefined28 = (i10 & 8) != 0 ? patchContactRecord.familyName : valueOrUndefined4;
        ValueOrUndefined valueOrUndefined29 = (i10 & 16) != 0 ? patchContactRecord.prefix : valueOrUndefined5;
        ValueOrUndefined valueOrUndefined30 = (i10 & 32) != 0 ? patchContactRecord.suffix : valueOrUndefined6;
        ValueOrUndefined valueOrUndefined31 = (i10 & 64) != 0 ? patchContactRecord.phoneticGivenName : valueOrUndefined7;
        ValueOrUndefined valueOrUndefined32 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? patchContactRecord.phoneticMiddleName : valueOrUndefined8;
        ValueOrUndefined valueOrUndefined33 = (i10 & 256) != 0 ? patchContactRecord.phoneticFamilyName : valueOrUndefined9;
        ValueOrUndefined valueOrUndefined34 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? patchContactRecord.company : valueOrUndefined10;
        ValueOrUndefined valueOrUndefined35 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? patchContactRecord.department : valueOrUndefined11;
        ValueOrUndefined valueOrUndefined36 = (i10 & 2048) != 0 ? patchContactRecord.jobTitle : valueOrUndefined12;
        ValueOrUndefined valueOrUndefined37 = (i10 & 4096) != 0 ? patchContactRecord.phoneticCompanyName : valueOrUndefined13;
        ValueOrUndefined valueOrUndefined38 = (i10 & 8192) != 0 ? patchContactRecord.note : valueOrUndefined14;
        ValueOrUndefined valueOrUndefined39 = valueOrUndefined25;
        ValueOrUndefined valueOrUndefined40 = (i10 & 16384) != 0 ? patchContactRecord.image : valueOrUndefined15;
        ValueOrUndefined valueOrUndefined41 = (i10 & 32768) != 0 ? patchContactRecord.emails : valueOrUndefined16;
        ValueOrUndefined valueOrUndefined42 = (i10 & 65536) != 0 ? patchContactRecord.phones : valueOrUndefined17;
        ValueOrUndefined valueOrUndefined43 = (i10 & 131072) != 0 ? patchContactRecord.dates : valueOrUndefined18;
        ValueOrUndefined valueOrUndefined44 = (i10 & 262144) != 0 ? patchContactRecord.addresses : valueOrUndefined19;
        ValueOrUndefined valueOrUndefined45 = (i10 & 524288) != 0 ? patchContactRecord.relations : valueOrUndefined20;
        ValueOrUndefined valueOrUndefined46 = (i10 & 1048576) != 0 ? patchContactRecord.urlAddresses : valueOrUndefined21;
        if ((i10 & 2097152) != 0) {
            valueOrUndefined24 = valueOrUndefined46;
            valueOrUndefined23 = patchContactRecord.extraNames;
        } else {
            valueOrUndefined23 = valueOrUndefined22;
            valueOrUndefined24 = valueOrUndefined46;
        }
        return patchContactRecord.copy(valueOrUndefined39, valueOrUndefined26, valueOrUndefined27, valueOrUndefined28, valueOrUndefined29, valueOrUndefined30, valueOrUndefined31, valueOrUndefined32, valueOrUndefined33, valueOrUndefined34, valueOrUndefined35, valueOrUndefined36, valueOrUndefined37, valueOrUndefined38, valueOrUndefined40, valueOrUndefined41, valueOrUndefined42, valueOrUndefined43, valueOrUndefined44, valueOrUndefined45, valueOrUndefined24, valueOrUndefined23);
    }

    public final ValueOrUndefined<Boolean> component1() {
        return this.isFavourite;
    }

    public final ValueOrUndefined<String> component10() {
        return this.company;
    }

    public final ValueOrUndefined<String> component11() {
        return this.department;
    }

    public final ValueOrUndefined<String> component12() {
        return this.jobTitle;
    }

    public final ValueOrUndefined<String> component13() {
        return this.phoneticCompanyName;
    }

    public final ValueOrUndefined<String> component14() {
        return this.note;
    }

    public final ValueOrUndefined<String> component15() {
        return this.image;
    }

    public final ValueOrUndefined<List<Either<EmailRecord.Patch, EmailRecord.New>>> component16() {
        return this.emails;
    }

    public final ValueOrUndefined<List<Either<PhoneRecord.Patch, PhoneRecord.New>>> component17() {
        return this.phones;
    }

    public final ValueOrUndefined<List<Either<DateRecord.Patch, DateRecord.New>>> component18() {
        return this.dates;
    }

    public final ValueOrUndefined<List<Either<AddressRecord.Patch, AddressRecord.New>>> component19() {
        return this.addresses;
    }

    public final ValueOrUndefined<String> component2() {
        return this.givenName;
    }

    public final ValueOrUndefined<List<Either<RelationRecord.Patch, RelationRecord.New>>> component20() {
        return this.relations;
    }

    public final ValueOrUndefined<List<Either<UrlAddressRecord.Patch, UrlAddressRecord.New>>> component21() {
        return this.urlAddresses;
    }

    public final ValueOrUndefined<List<Either<ExtraNameRecord.Patch, ExtraNameRecord.New>>> component22() {
        return this.extraNames;
    }

    public final ValueOrUndefined<String> component3() {
        return this.middleName;
    }

    public final ValueOrUndefined<String> component4() {
        return this.familyName;
    }

    public final ValueOrUndefined<String> component5() {
        return this.prefix;
    }

    public final ValueOrUndefined<String> component6() {
        return this.suffix;
    }

    public final ValueOrUndefined<String> component7() {
        return this.phoneticGivenName;
    }

    public final ValueOrUndefined<String> component8() {
        return this.phoneticMiddleName;
    }

    public final ValueOrUndefined<String> component9() {
        return this.phoneticFamilyName;
    }

    public final PatchContactRecord copy(ValueOrUndefined<Boolean> isFavourite, ValueOrUndefined<String> givenName, ValueOrUndefined<String> middleName, ValueOrUndefined<String> familyName, ValueOrUndefined<String> prefix, ValueOrUndefined<String> suffix, ValueOrUndefined<String> phoneticGivenName, ValueOrUndefined<String> phoneticMiddleName, ValueOrUndefined<String> phoneticFamilyName, ValueOrUndefined<String> company, ValueOrUndefined<String> department, ValueOrUndefined<String> jobTitle, ValueOrUndefined<String> phoneticCompanyName, ValueOrUndefined<String> note, ValueOrUndefined<String> image, ValueOrUndefined<List<Either<EmailRecord.Patch, EmailRecord.New>>> emails, ValueOrUndefined<List<Either<PhoneRecord.Patch, PhoneRecord.New>>> phones, ValueOrUndefined<List<Either<DateRecord.Patch, DateRecord.New>>> dates, ValueOrUndefined<List<Either<AddressRecord.Patch, AddressRecord.New>>> addresses, ValueOrUndefined<List<Either<RelationRecord.Patch, RelationRecord.New>>> relations, ValueOrUndefined<List<Either<UrlAddressRecord.Patch, UrlAddressRecord.New>>> urlAddresses, ValueOrUndefined<List<Either<ExtraNameRecord.Patch, ExtraNameRecord.New>>> extraNames) {
        AbstractC2855l.g(isFavourite, "isFavourite");
        AbstractC2855l.g(givenName, "givenName");
        AbstractC2855l.g(middleName, "middleName");
        AbstractC2855l.g(familyName, "familyName");
        AbstractC2855l.g(prefix, "prefix");
        AbstractC2855l.g(suffix, "suffix");
        AbstractC2855l.g(phoneticGivenName, "phoneticGivenName");
        AbstractC2855l.g(phoneticMiddleName, "phoneticMiddleName");
        AbstractC2855l.g(phoneticFamilyName, "phoneticFamilyName");
        AbstractC2855l.g(company, "company");
        AbstractC2855l.g(department, "department");
        AbstractC2855l.g(jobTitle, "jobTitle");
        AbstractC2855l.g(phoneticCompanyName, "phoneticCompanyName");
        AbstractC2855l.g(note, "note");
        AbstractC2855l.g(image, "image");
        AbstractC2855l.g(emails, "emails");
        AbstractC2855l.g(phones, "phones");
        AbstractC2855l.g(dates, "dates");
        AbstractC2855l.g(addresses, "addresses");
        AbstractC2855l.g(relations, "relations");
        AbstractC2855l.g(urlAddresses, "urlAddresses");
        AbstractC2855l.g(extraNames, "extraNames");
        return new PatchContactRecord(isFavourite, givenName, middleName, familyName, prefix, suffix, phoneticGivenName, phoneticMiddleName, phoneticFamilyName, company, department, jobTitle, phoneticCompanyName, note, image, emails, phones, dates, addresses, relations, urlAddresses, extraNames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PatchContactRecord)) {
            return false;
        }
        PatchContactRecord patchContactRecord = (PatchContactRecord) other;
        return AbstractC2855l.b(this.isFavourite, patchContactRecord.isFavourite) && AbstractC2855l.b(this.givenName, patchContactRecord.givenName) && AbstractC2855l.b(this.middleName, patchContactRecord.middleName) && AbstractC2855l.b(this.familyName, patchContactRecord.familyName) && AbstractC2855l.b(this.prefix, patchContactRecord.prefix) && AbstractC2855l.b(this.suffix, patchContactRecord.suffix) && AbstractC2855l.b(this.phoneticGivenName, patchContactRecord.phoneticGivenName) && AbstractC2855l.b(this.phoneticMiddleName, patchContactRecord.phoneticMiddleName) && AbstractC2855l.b(this.phoneticFamilyName, patchContactRecord.phoneticFamilyName) && AbstractC2855l.b(this.company, patchContactRecord.company) && AbstractC2855l.b(this.department, patchContactRecord.department) && AbstractC2855l.b(this.jobTitle, patchContactRecord.jobTitle) && AbstractC2855l.b(this.phoneticCompanyName, patchContactRecord.phoneticCompanyName) && AbstractC2855l.b(this.note, patchContactRecord.note) && AbstractC2855l.b(this.image, patchContactRecord.image) && AbstractC2855l.b(this.emails, patchContactRecord.emails) && AbstractC2855l.b(this.phones, patchContactRecord.phones) && AbstractC2855l.b(this.dates, patchContactRecord.dates) && AbstractC2855l.b(this.addresses, patchContactRecord.addresses) && AbstractC2855l.b(this.relations, patchContactRecord.relations) && AbstractC2855l.b(this.urlAddresses, patchContactRecord.urlAddresses) && AbstractC2855l.b(this.extraNames, patchContactRecord.extraNames);
    }

    public final ValueOrUndefined<List<Either<AddressRecord.Patch, AddressRecord.New>>> getAddresses() {
        return this.addresses;
    }

    public final ValueOrUndefined<String> getCompany() {
        return this.company;
    }

    public final ValueOrUndefined<List<Either<DateRecord.Patch, DateRecord.New>>> getDates() {
        return this.dates;
    }

    public final ValueOrUndefined<String> getDepartment() {
        return this.department;
    }

    public final ValueOrUndefined<List<Either<EmailRecord.Patch, EmailRecord.New>>> getEmails() {
        return this.emails;
    }

    public final ValueOrUndefined<List<Either<ExtraNameRecord.Patch, ExtraNameRecord.New>>> getExtraNames() {
        return this.extraNames;
    }

    public final ValueOrUndefined<String> getFamilyName() {
        return this.familyName;
    }

    public final ValueOrUndefined<String> getGivenName() {
        return this.givenName;
    }

    public final ValueOrUndefined<String> getImage() {
        return this.image;
    }

    public final ValueOrUndefined<String> getJobTitle() {
        return this.jobTitle;
    }

    public final ValueOrUndefined<String> getMiddleName() {
        return this.middleName;
    }

    public final ValueOrUndefined<String> getNote() {
        return this.note;
    }

    public final ValueOrUndefined<List<Either<PhoneRecord.Patch, PhoneRecord.New>>> getPhones() {
        return this.phones;
    }

    public final ValueOrUndefined<String> getPhoneticCompanyName() {
        return this.phoneticCompanyName;
    }

    public final ValueOrUndefined<String> getPhoneticFamilyName() {
        return this.phoneticFamilyName;
    }

    public final ValueOrUndefined<String> getPhoneticGivenName() {
        return this.phoneticGivenName;
    }

    public final ValueOrUndefined<String> getPhoneticMiddleName() {
        return this.phoneticMiddleName;
    }

    public final ValueOrUndefined<String> getPrefix() {
        return this.prefix;
    }

    public final ValueOrUndefined<List<Either<RelationRecord.Patch, RelationRecord.New>>> getRelations() {
        return this.relations;
    }

    public final ValueOrUndefined<String> getSuffix() {
        return this.suffix;
    }

    public final ValueOrUndefined<List<Either<UrlAddressRecord.Patch, UrlAddressRecord.New>>> getUrlAddresses() {
        return this.urlAddresses;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.isFavourite.hashCode() * 31) + this.givenName.hashCode()) * 31) + this.middleName.hashCode()) * 31) + this.familyName.hashCode()) * 31) + this.prefix.hashCode()) * 31) + this.suffix.hashCode()) * 31) + this.phoneticGivenName.hashCode()) * 31) + this.phoneticMiddleName.hashCode()) * 31) + this.phoneticFamilyName.hashCode()) * 31) + this.company.hashCode()) * 31) + this.department.hashCode()) * 31) + this.jobTitle.hashCode()) * 31) + this.phoneticCompanyName.hashCode()) * 31) + this.note.hashCode()) * 31) + this.image.hashCode()) * 31) + this.emails.hashCode()) * 31) + this.phones.hashCode()) * 31) + this.dates.hashCode()) * 31) + this.addresses.hashCode()) * 31) + this.relations.hashCode()) * 31) + this.urlAddresses.hashCode()) * 31) + this.extraNames.hashCode();
    }

    public final ValueOrUndefined<Boolean> isFavourite() {
        return this.isFavourite;
    }

    public String toString() {
        return "PatchContactRecord(isFavourite=" + this.isFavourite + ", givenName=" + this.givenName + ", middleName=" + this.middleName + ", familyName=" + this.familyName + ", prefix=" + this.prefix + ", suffix=" + this.suffix + ", phoneticGivenName=" + this.phoneticGivenName + ", phoneticMiddleName=" + this.phoneticMiddleName + ", phoneticFamilyName=" + this.phoneticFamilyName + ", company=" + this.company + ", department=" + this.department + ", jobTitle=" + this.jobTitle + ", phoneticCompanyName=" + this.phoneticCompanyName + ", note=" + this.note + ", image=" + this.image + ", emails=" + this.emails + ", phones=" + this.phones + ", dates=" + this.dates + ", addresses=" + this.addresses + ", relations=" + this.relations + ", urlAddresses=" + this.urlAddresses + ", extraNames=" + this.extraNames + ")";
    }

    public PatchContactRecord(ValueOrUndefined<Boolean> isFavourite, ValueOrUndefined<String> givenName, ValueOrUndefined<String> middleName, ValueOrUndefined<String> familyName, ValueOrUndefined<String> prefix, ValueOrUndefined<String> suffix, ValueOrUndefined<String> phoneticGivenName, ValueOrUndefined<String> phoneticMiddleName, ValueOrUndefined<String> phoneticFamilyName, ValueOrUndefined<String> company, ValueOrUndefined<String> department, ValueOrUndefined<String> jobTitle, ValueOrUndefined<String> phoneticCompanyName, ValueOrUndefined<String> note, ValueOrUndefined<String> image, ValueOrUndefined<List<Either<EmailRecord.Patch, EmailRecord.New>>> emails, ValueOrUndefined<List<Either<PhoneRecord.Patch, PhoneRecord.New>>> phones, ValueOrUndefined<List<Either<DateRecord.Patch, DateRecord.New>>> dates, ValueOrUndefined<List<Either<AddressRecord.Patch, AddressRecord.New>>> addresses, ValueOrUndefined<List<Either<RelationRecord.Patch, RelationRecord.New>>> relations, ValueOrUndefined<List<Either<UrlAddressRecord.Patch, UrlAddressRecord.New>>> urlAddresses, ValueOrUndefined<List<Either<ExtraNameRecord.Patch, ExtraNameRecord.New>>> extraNames) {
        AbstractC2855l.g(isFavourite, "isFavourite");
        AbstractC2855l.g(givenName, "givenName");
        AbstractC2855l.g(middleName, "middleName");
        AbstractC2855l.g(familyName, "familyName");
        AbstractC2855l.g(prefix, "prefix");
        AbstractC2855l.g(suffix, "suffix");
        AbstractC2855l.g(phoneticGivenName, "phoneticGivenName");
        AbstractC2855l.g(phoneticMiddleName, "phoneticMiddleName");
        AbstractC2855l.g(phoneticFamilyName, "phoneticFamilyName");
        AbstractC2855l.g(company, "company");
        AbstractC2855l.g(department, "department");
        AbstractC2855l.g(jobTitle, "jobTitle");
        AbstractC2855l.g(phoneticCompanyName, "phoneticCompanyName");
        AbstractC2855l.g(note, "note");
        AbstractC2855l.g(image, "image");
        AbstractC2855l.g(emails, "emails");
        AbstractC2855l.g(phones, "phones");
        AbstractC2855l.g(dates, "dates");
        AbstractC2855l.g(addresses, "addresses");
        AbstractC2855l.g(relations, "relations");
        AbstractC2855l.g(urlAddresses, "urlAddresses");
        AbstractC2855l.g(extraNames, "extraNames");
        this.isFavourite = isFavourite;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.prefix = prefix;
        this.suffix = suffix;
        this.phoneticGivenName = phoneticGivenName;
        this.phoneticMiddleName = phoneticMiddleName;
        this.phoneticFamilyName = phoneticFamilyName;
        this.company = company;
        this.department = department;
        this.jobTitle = jobTitle;
        this.phoneticCompanyName = phoneticCompanyName;
        this.note = note;
        this.image = image;
        this.emails = emails;
        this.phones = phones;
        this.dates = dates;
        this.addresses = addresses;
        this.relations = relations;
        this.urlAddresses = urlAddresses;
        this.extraNames = extraNames;
    }

    @Field
    public static /* synthetic */ void getAddresses$annotations() {
    }

    @Field
    public static /* synthetic */ void getCompany$annotations() {
    }

    @Field
    public static /* synthetic */ void getDates$annotations() {
    }

    @Field
    public static /* synthetic */ void getDepartment$annotations() {
    }

    @Field
    public static /* synthetic */ void getEmails$annotations() {
    }

    @Field
    public static /* synthetic */ void getExtraNames$annotations() {
    }

    @Field
    public static /* synthetic */ void getFamilyName$annotations() {
    }

    @Field
    public static /* synthetic */ void getGivenName$annotations() {
    }

    @Field
    public static /* synthetic */ void getImage$annotations() {
    }

    @Field
    public static /* synthetic */ void getJobTitle$annotations() {
    }

    @Field
    public static /* synthetic */ void getMiddleName$annotations() {
    }

    @Field
    public static /* synthetic */ void getNote$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhones$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticCompanyName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticFamilyName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticGivenName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticMiddleName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPrefix$annotations() {
    }

    @Field
    public static /* synthetic */ void getRelations$annotations() {
    }

    @Field
    public static /* synthetic */ void getSuffix$annotations() {
    }

    @Field
    public static /* synthetic */ void getUrlAddresses$annotations() {
    }

    @Field
    public static /* synthetic */ void isFavourite$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PatchContactRecord(ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, ValueOrUndefined valueOrUndefined3, ValueOrUndefined valueOrUndefined4, ValueOrUndefined valueOrUndefined5, ValueOrUndefined valueOrUndefined6, ValueOrUndefined valueOrUndefined7, ValueOrUndefined valueOrUndefined8, ValueOrUndefined valueOrUndefined9, ValueOrUndefined valueOrUndefined10, ValueOrUndefined valueOrUndefined11, ValueOrUndefined valueOrUndefined12, ValueOrUndefined valueOrUndefined13, ValueOrUndefined valueOrUndefined14, ValueOrUndefined valueOrUndefined15, ValueOrUndefined valueOrUndefined16, ValueOrUndefined valueOrUndefined17, ValueOrUndefined valueOrUndefined18, ValueOrUndefined valueOrUndefined19, ValueOrUndefined valueOrUndefined20, ValueOrUndefined valueOrUndefined21, ValueOrUndefined valueOrUndefined22, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        ValueOrUndefined valueOrUndefined23;
        ValueOrUndefined valueOrUndefined24;
        ValueOrUndefined valueOrUndefined25;
        ValueOrUndefined valueOrUndefined26;
        ValueOrUndefined valueOrUndefined27;
        ValueOrUndefined valueOrUndefined28;
        ValueOrUndefined valueOrUndefined29;
        ValueOrUndefined valueOrUndefined30;
        ValueOrUndefined valueOrUndefined31;
        ValueOrUndefined valueOrUndefined32;
        ValueOrUndefined valueOrUndefined33;
        ValueOrUndefined valueOrUndefined34;
        ValueOrUndefined valueOrUndefined35;
        ValueOrUndefined valueOrUndefined36;
        ValueOrUndefined valueOrUndefined37;
        ValueOrUndefined valueOrUndefined38;
        ValueOrUndefined valueOrUndefined39;
        ValueOrUndefined valueOrUndefined40;
        ValueOrUndefined valueOrUndefined41;
        ValueOrUndefined valueOrUndefined42;
        ValueOrUndefined valueOrUndefined43;
        ValueOrUndefined valueOrUndefined44;
        ValueOrUndefined valueOrUndefined45;
        ValueOrUndefined valueOrUndefined46;
        ValueOrUndefined valueOrUndefined47;
        ValueOrUndefined valueOrUndefined48;
        ValueOrUndefined valueOrUndefined49;
        ValueOrUndefined valueOrUndefined50;
        if ((i10 & 1) != 0) {
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            valueOrUndefined23 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined23, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined23 = valueOrUndefined;
        }
        if ((i10 & 2) != 0) {
            ValueOrUndefined.Companion companion2 = ValueOrUndefined.INSTANCE;
            valueOrUndefined24 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined24, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined24 = valueOrUndefined2;
        }
        if ((i10 & 4) != 0) {
            ValueOrUndefined.Companion companion3 = ValueOrUndefined.INSTANCE;
            valueOrUndefined25 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined25, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined25 = valueOrUndefined3;
        }
        if ((i10 & 8) != 0) {
            ValueOrUndefined.Companion companion4 = ValueOrUndefined.INSTANCE;
            valueOrUndefined26 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined26, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined26 = valueOrUndefined4;
        }
        if ((i10 & 16) != 0) {
            ValueOrUndefined.Companion companion5 = ValueOrUndefined.INSTANCE;
            valueOrUndefined27 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined27, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined27 = valueOrUndefined5;
        }
        if ((i10 & 32) != 0) {
            ValueOrUndefined.Companion companion6 = ValueOrUndefined.INSTANCE;
            valueOrUndefined28 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined28, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined28 = valueOrUndefined6;
        }
        if ((i10 & 64) != 0) {
            ValueOrUndefined.Companion companion7 = ValueOrUndefined.INSTANCE;
            valueOrUndefined29 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined29, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined29 = valueOrUndefined7;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            ValueOrUndefined.Companion companion8 = ValueOrUndefined.INSTANCE;
            valueOrUndefined30 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined30, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined30 = valueOrUndefined8;
        }
        if ((i10 & 256) != 0) {
            ValueOrUndefined.Companion companion9 = ValueOrUndefined.INSTANCE;
            valueOrUndefined31 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined31, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined31 = valueOrUndefined9;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            ValueOrUndefined.Companion companion10 = ValueOrUndefined.INSTANCE;
            valueOrUndefined32 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined32, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined32 = valueOrUndefined10;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            ValueOrUndefined.Companion companion11 = ValueOrUndefined.INSTANCE;
            valueOrUndefined33 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined33, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined33 = valueOrUndefined11;
        }
        if ((i10 & 2048) != 0) {
            ValueOrUndefined.Companion companion12 = ValueOrUndefined.INSTANCE;
            valueOrUndefined34 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined34, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined34 = valueOrUndefined12;
        }
        if ((i10 & 4096) != 0) {
            ValueOrUndefined.Companion companion13 = ValueOrUndefined.INSTANCE;
            valueOrUndefined35 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined35, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined35 = valueOrUndefined13;
        }
        if ((i10 & 8192) != 0) {
            ValueOrUndefined.Companion companion14 = ValueOrUndefined.INSTANCE;
            valueOrUndefined36 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined36, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined36 = valueOrUndefined14;
        }
        ValueOrUndefined valueOrUndefined51 = valueOrUndefined23;
        if ((i10 & 16384) != 0) {
            ValueOrUndefined.Companion companion15 = ValueOrUndefined.INSTANCE;
            valueOrUndefined37 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined37, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined37 = valueOrUndefined15;
        }
        if ((i10 & 32768) != 0) {
            ValueOrUndefined.Companion companion16 = ValueOrUndefined.INSTANCE;
            valueOrUndefined38 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined38, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined38 = valueOrUndefined16;
        }
        if ((i10 & 65536) != 0) {
            ValueOrUndefined.Companion companion17 = ValueOrUndefined.INSTANCE;
            valueOrUndefined39 = valueOrUndefined38;
            valueOrUndefined40 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined40, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined39 = valueOrUndefined38;
            valueOrUndefined40 = valueOrUndefined17;
        }
        if ((i10 & 131072) != 0) {
            ValueOrUndefined.Companion companion18 = ValueOrUndefined.INSTANCE;
            valueOrUndefined41 = valueOrUndefined40;
            valueOrUndefined42 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined42, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined41 = valueOrUndefined40;
            valueOrUndefined42 = valueOrUndefined18;
        }
        if ((i10 & 262144) != 0) {
            ValueOrUndefined.Companion companion19 = ValueOrUndefined.INSTANCE;
            valueOrUndefined43 = valueOrUndefined42;
            valueOrUndefined44 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined44, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined43 = valueOrUndefined42;
            valueOrUndefined44 = valueOrUndefined19;
        }
        if ((i10 & 524288) != 0) {
            ValueOrUndefined.Companion companion20 = ValueOrUndefined.INSTANCE;
            valueOrUndefined45 = valueOrUndefined44;
            valueOrUndefined46 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined46, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined45 = valueOrUndefined44;
            valueOrUndefined46 = valueOrUndefined20;
        }
        if ((i10 & 1048576) != 0) {
            ValueOrUndefined.Companion companion21 = ValueOrUndefined.INSTANCE;
            valueOrUndefined47 = valueOrUndefined46;
            valueOrUndefined48 = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(valueOrUndefined48, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        } else {
            valueOrUndefined47 = valueOrUndefined46;
            valueOrUndefined48 = valueOrUndefined21;
        }
        if ((i10 & 2097152) != 0) {
            ValueOrUndefined.Companion companion22 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined valueOrUndefined52 = valueOrUndefined48;
            ValueOrUndefined.Undefined undefined = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(undefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined50 = valueOrUndefined52;
            valueOrUndefined49 = undefined;
        } else {
            valueOrUndefined49 = valueOrUndefined22;
            valueOrUndefined50 = valueOrUndefined48;
        }
        this(valueOrUndefined51, valueOrUndefined24, valueOrUndefined25, valueOrUndefined26, valueOrUndefined27, valueOrUndefined28, valueOrUndefined29, valueOrUndefined30, valueOrUndefined31, valueOrUndefined32, valueOrUndefined33, valueOrUndefined34, valueOrUndefined35, valueOrUndefined36, valueOrUndefined37, valueOrUndefined39, valueOrUndefined41, valueOrUndefined43, valueOrUndefined45, valueOrUndefined47, valueOrUndefined50, valueOrUndefined49);
    }
}
