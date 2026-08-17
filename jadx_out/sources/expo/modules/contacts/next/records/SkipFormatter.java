package expo.modules.contacts.next.records;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.records.contact.GetContactDetailsRecord;
import expo.modules.contacts.next.records.fields.ContactField;
import expo.modules.kotlin.records.formatters.FormattedRecord;
import expo.modules.kotlin.records.formatters.Formatter;
import expo.modules.kotlin.records.formatters.FormatterKt;
import i7.C2735B;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\f\u001a\u00020\tR\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lexpo/modules/contacts/next/records/SkipFormatter;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fields", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/records/fields/ContactField;", "<init>", "(Ljava/util/Set;)V", "formatter", "Lexpo/modules/kotlin/records/formatters/Formatter;", "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;", "format", "Lexpo/modules/kotlin/records/formatters/FormattedRecord;", "getContactDetailsRecord", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SkipFormatter {
    private final Set<ContactField> fields;
    private final Formatter<GetContactDetailsRecord> formatter = FormatterKt.formatter(new Function1() { // from class: expo.modules.contacts.next.records.a
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return SkipFormatter.formatter$lambda$24(this.f26483g, (Formatter.Builder) obj);
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public SkipFormatter(Set<? extends ContactField> set) {
        this.fields = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B formatter$lambda$24(final SkipFormatter skipFormatter, Formatter.Builder formatter) {
        AbstractC2855l.g(formatter, "$this$formatter");
        if (skipFormatter.fields == null) {
            return C2735B.f28704a;
        }
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$1
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getFullName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$0(this.f26494g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$3
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getGivenName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$1(this.f26486g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$5
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getMiddleName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$2(this.f26491g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$7
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getFamilyName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$3(this.f26492g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$9
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getPrefix();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$4(this.f26493g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$11
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getSuffix();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$5(this.f26495g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$13
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getPhoneticGivenName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$6(this.f26496g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$15
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getPhoneticMiddleName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$7(this.f26497g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$17
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getPhoneticFamilyName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$8(this.f26498g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$19
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getCompany();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$9(this.f26499g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$21
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getDepartment();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$10(this.f26500g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$23
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getJobTitle();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$11(this.f26501g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$25
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getPhoneticCompanyName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$12(this.f26502g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$27
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getImage();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$13(this.f26503g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$29
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getThumbnail();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$14(this.f26504g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$31
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getNote();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$15(this.f26505g, (String) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$33
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getIsFavourite();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$16(this.f26506g, (Boolean) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$35
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getEmails();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$17(this.f26507g, (List) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$37
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getPhones();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$18(this.f26484g, (List) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$39
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getAddresses();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$19(this.f26485g, (List) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$41
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getDates();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$20(this.f26487g, (List) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$43
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getRelations();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$21(this.f26488g, (List) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$45
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getUrlAddresses();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$22(this.f26489g, (List) obj));
            }
        });
        formatter.property((C7.m) new kotlin.jvm.internal.v() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$47
            @Override // kotlin.jvm.internal.v, C7.m
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getExtraNames();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SkipFormatter.formatter$lambda$24$lambda$23(this.f26490g, (List) obj));
            }
        });
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$0(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.FULL_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$1(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.GIVEN_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$10(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.DEPARTMENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$11(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.JOB_TITLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$12(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.PHONETIC_COMPANY_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$13(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.IMAGE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$14(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.THUMBNAIL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$15(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.NOTE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$16(SkipFormatter skipFormatter, Boolean bool) {
        return !skipFormatter.fields.contains(ContactField.IS_FAVOURITE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$17(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.EMAILS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$18(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.PHONES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$19(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.ADDRESSES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$2(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.MIDDLE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$20(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.DATES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$21(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.RELATIONS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$22(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.URL_ADDRESSES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$23(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.EXTRA_NAMES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$3(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.FAMILY_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$4(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.PREFIX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$5(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.SUFFIX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$6(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.PHONETIC_GIVEN_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$7(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.PHONETIC_MIDDLE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$8(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.PHONETIC_FAMILY_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$9(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.COMPANY);
    }

    public final FormattedRecord<GetContactDetailsRecord> format(GetContactDetailsRecord getContactDetailsRecord) {
        AbstractC2855l.g(getContactDetailsRecord, "getContactDetailsRecord");
        return this.formatter.format(getContactDetailsRecord);
    }
}
