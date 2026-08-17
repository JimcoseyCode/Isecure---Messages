.class public final Lexpo/modules/contacts/next/ContactsNextModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010.\u001a\u00020/H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\u0008\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\r\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\r\u001a\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\r\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\r\u001a\u0004\u0008!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010\r\u001a\u0004\u0008&\u0010\'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010\r\u001a\u0004\u0008+\u0010,\u00a8\u00060"
    }
    d2 = {
        "Lexpo/modules/contacts/next/ContactsNextModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "context",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "imageByteArrayConverter",
        "Lexpo/modules/contacts/next/services/ImageByteArrayConverter;",
        "getImageByteArrayConverter",
        "()Lexpo/modules/contacts/next/services/ImageByteArrayConverter;",
        "imageByteArrayConverter$delegate",
        "Lkotlin/Lazy;",
        "photoPropertyMapper",
        "Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;",
        "getPhotoPropertyMapper",
        "()Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;",
        "photoPropertyMapper$delegate",
        "contactMapper",
        "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;",
        "getContactMapper",
        "()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;",
        "contactMapper$delegate",
        "contactIntentDelegate",
        "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;",
        "contactRepository",
        "Lexpo/modules/contacts/next/domain/ContactRepository;",
        "getContactRepository",
        "()Lexpo/modules/contacts/next/domain/ContactRepository;",
        "contactRepository$delegate",
        "contactFactory",
        "Lexpo/modules/contacts/next/ContactFactory;",
        "getContactFactory",
        "()Lexpo/modules/contacts/next/ContactFactory;",
        "contactFactory$delegate",
        "permissionsDelegate",
        "Lexpo/modules/contacts/next/ContactsPermissionsDelegate;",
        "getPermissionsDelegate",
        "()Lexpo/modules/contacts/next/ContactsPermissionsDelegate;",
        "permissionsDelegate$delegate",
        "observerDelegate",
        "Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;",
        "getObserverDelegate",
        "()Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;",
        "observerDelegate$delegate",
        "definition",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "expo-contacts_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final contactFactory$delegate:Lkotlin/Lazy;

.field private final contactIntentDelegate:Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

.field private final contactMapper$delegate:Lkotlin/Lazy;

.field private final contactRepository$delegate:Lkotlin/Lazy;

.field private final imageByteArrayConverter$delegate:Lkotlin/Lazy;

.field private final observerDelegate$delegate:Lkotlin/Lazy;

.field private final permissionsDelegate$delegate:Lkotlin/Lazy;

.field private final photoPropertyMapper$delegate:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/modules/Module;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lexpo/modules/contacts/next/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lexpo/modules/contacts/next/a;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->imageByteArrayConverter$delegate:Lkotlin/Lazy;

    .line 14
    .line 15
    new-instance v0, Lexpo/modules/contacts/next/b;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lexpo/modules/contacts/next/b;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->photoPropertyMapper$delegate:Lkotlin/Lazy;

    .line 25
    .line 26
    new-instance v0, Lexpo/modules/contacts/next/c;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lexpo/modules/contacts/next/c;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->contactMapper$delegate:Lkotlin/Lazy;

    .line 36
    .line 37
    new-instance v0, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

    .line 38
    .line 39
    invoke-direct {v0}, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->contactIntentDelegate:Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

    .line 43
    .line 44
    new-instance v0, Lexpo/modules/contacts/next/d;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Lexpo/modules/contacts/next/d;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->contactRepository$delegate:Lkotlin/Lazy;

    .line 54
    .line 55
    new-instance v0, Lexpo/modules/contacts/next/e;

    .line 56
    .line 57
    invoke-direct {v0, p0}, Lexpo/modules/contacts/next/e;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->contactFactory$delegate:Lkotlin/Lazy;

    .line 65
    .line 66
    new-instance v0, Lexpo/modules/contacts/next/f;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lexpo/modules/contacts/next/f;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->permissionsDelegate$delegate:Lkotlin/Lazy;

    .line 76
    .line 77
    new-instance v0, Lexpo/modules/contacts/next/g;

    .line 78
    .line 79
    invoke-direct {v0, p0}, Lexpo/modules/contacts/next/g;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->observerDelegate$delegate:Lkotlin/Lazy;

    .line 87
    .line 88
    return-void
.end method

.method public static final synthetic access$getContactFactory(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/ContactFactory;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->getContactFactory()Lexpo/modules/contacts/next/ContactFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getContactIntentDelegate$p(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/intents/ContactIntentDelegate;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->contactIntentDelegate:Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getContactMapper(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->getContactMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getContactRepository(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/domain/ContactRepository;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->getContactRepository()Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getObserverDelegate(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->getObserverDelegate()Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getPermissionsDelegate(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/ContactsPermissionsDelegate;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->getPermissionsDelegate()Lexpo/modules/contacts/next/ContactsPermissionsDelegate;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/ContactFactory;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->contactFactory_delegate$lambda$4(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/ContactFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->photoPropertyMapper_delegate$lambda$1(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final contactFactory_delegate$lambda$4(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/ContactFactory;
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/ContactFactory;

    .line 2
    .line 3
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->getContactRepository()Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->getContactMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->getPhotoPropertyMapper()Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object p0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->contactIntentDelegate:Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, v3, p0}, Lexpo/modules/contacts/next/ContactFactory;-><init>(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;Lexpo/modules/contacts/next/intents/ContactIntentDelegate;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method private static final contactMapper_delegate$lambda$2(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 2
    .line 3
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->getImageByteArrayConverter()Lexpo/modules/contacts/next/services/ImageByteArrayConverter;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;-><init>(Lexpo/modules/contacts/next/services/ImageByteArrayConverter;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private static final contactRepository_delegate$lambda$3(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/domain/ContactRepository;
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 2
    .line 3
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, "getContentResolver(...)"

    .line 12
    .line 13
    invoke-static {p0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0}, Lexpo/modules/contacts/next/domain/ContactRepository;-><init>(Landroid/content/ContentResolver;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static synthetic d(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->observerDelegate_delegate$lambda$6(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->contactMapper_delegate$lambda$2(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/services/ImageByteArrayConverter;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->imageByteArrayConverter_delegate$lambda$0(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/services/ImageByteArrayConverter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/domain/ContactRepository;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->contactRepository_delegate$lambda$3(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getContactFactory()Lexpo/modules/contacts/next/ContactFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->contactFactory$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/contacts/next/ContactFactory;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getContactMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->contactMapper$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getContactRepository()Lexpo/modules/contacts/next/domain/ContactRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->contactRepository$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;

    .line 13
    .line 14
    invoke-direct {v0}, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method private final getImageByteArrayConverter()Lexpo/modules/contacts/next/services/ImageByteArrayConverter;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->imageByteArrayConverter$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/contacts/next/services/ImageByteArrayConverter;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getObserverDelegate()Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->observerDelegate$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getPermissionsDelegate()Lexpo/modules/contacts/next/ContactsPermissionsDelegate;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->permissionsDelegate$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getPhotoPropertyMapper()Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactsNextModule;->photoPropertyMapper$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic h(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/ContactsPermissionsDelegate;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->permissionsDelegate_delegate$lambda$5(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/ContactsPermissionsDelegate;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final imageByteArrayConverter_delegate$lambda$0(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/services/ImageByteArrayConverter;
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/services/ImageByteArrayConverter;

    .line 2
    .line 3
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, "getContentResolver(...)"

    .line 12
    .line 13
    invoke-static {p0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0}, Lexpo/modules/contacts/next/services/ImageByteArrayConverter;-><init>(Landroid/content/ContentResolver;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method private static final observerDelegate_delegate$lambda$6(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p0}, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;-><init>(Lexpo/modules/kotlin/AppContext;Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private static final permissionsDelegate_delegate$lambda$5(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/ContactsPermissionsDelegate;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;-><init>(Lexpo/modules/kotlin/AppContext;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private static final photoPropertyMapper_delegate$lambda$1(Lexpo/modules/contacts/next/ContactsNextModule;)Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;

    .line 2
    .line 3
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsNextModule;->getImageByteArrayConverter()Lexpo/modules/contacts/next/services/ImageByteArrayConverter;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;-><init>(Lexpo/modules/contacts/next/services/ImageByteArrayConverter;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 35

    move-object/from16 v1, p0

    .line 1
    const-class v0, Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;

    const-class v2, Lexpo/modules/contacts/next/records/fields/EmailRecord$New;

    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;

    const-string v5, "onContactsChange"

    const-class v6, Ljava/lang/Object;

    const-class v7, Lexpo/modules/contacts/next/records/ContactQueryOptions;

    const-class v8, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;

    const-class v9, Lexpo/modules/contacts/next/records/fields/RelationRecord$Existing;

    const-class v10, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Existing;

    const-class v11, Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;

    const-class v12, Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;

    const-class v13, Lexpo/modules/contacts/next/records/fields/PhoneRecord$Existing;

    const-class v14, Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;

    const-class v15, Ljava/util/Set;

    const-class v16, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;

    move-object/from16 v17, v2

    const-class v2, Lexpo/modules/kotlin/Promise;

    move-object/from16 v18, v3

    const-class v3, Ljava/lang/String;

    const-class v19, Lexpo/modules/contacts/next/Contact;

    move-object/from16 v20, v4

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    move-object/from16 v21, v6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ".ModuleDefinition"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 3
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v22, v7

    const-string v7, "["

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "ExpoModulesCore"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "] "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-static {v4}, Ll1/a;->c(Ljava/lang/String;)V

    .line 5
    :try_start_0
    new-instance v4, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    invoke-direct {v4, v1}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 6
    const-string v6, "ExpoContactsNext"

    invoke-virtual {v4, v6}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 7
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v26

    .line 8
    new-instance v23, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;

    .line 9
    invoke-virtual {v4}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getModule()Lexpo/modules/kotlin/modules/Module;

    move-result-object v6

    if-eqz v6, :cond_7f

    invoke-virtual {v6}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v24

    .line 10
    invoke-static/range {v26 .. v26}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "getSimpleName(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    sget-object v7, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    move-object/from16 v25, v6

    .line 12
    new-instance v6, Lkotlin/Pair;

    move-object/from16 v29, v7

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    move-object/from16 v30, v8

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v6, v7, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_0

    .line 14
    sget-object v6, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$$inlined$Class$1;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$$inlined$Class$1;

    .line 15
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v31, v9

    .line 16
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v32, v10

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    move-object/from16 v33, v11

    const/4 v11, 0x0

    invoke-direct {v9, v10, v11, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v6, 0x0

    .line 17
    invoke-direct {v7, v9, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v27, v7

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :cond_0
    move-object/from16 v31, v9

    move-object/from16 v32, v10

    move-object/from16 v33, v11

    move-object/from16 v27, v6

    .line 18
    :goto_0
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v28

    .line 19
    invoke-direct/range {v23 .. v28}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;-><init>(Lexpo/modules/kotlin/AppContext;Ljava/lang/String;LC7/d;Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v6, v23

    .line 20
    new-instance v7, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const-string v9, "constructor"

    invoke-virtual {v6}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v10

    .line 21
    new-instance v11, Lkotlin/Pair;

    move-object/from16 v23, v12

    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_1

    .line 23
    sget-object v11, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Constructor$1;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Constructor$1;

    .line 24
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v24, v13

    .line 25
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v25, v14

    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    move-object/from16 v26, v15

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 26
    invoke-direct {v12, v13, v10}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    goto :goto_1

    :cond_1
    move-object/from16 v24, v13

    move-object/from16 v25, v14

    move-object/from16 v26, v15

    .line 27
    :goto_1
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v10

    .line 28
    sget-object v11, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 29
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v12

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v12, :cond_2

    new-instance v12, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-direct {v12, v13}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 30
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v13

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-interface {v13, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    :cond_2
    new-instance v13, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Constructor$2;

    invoke-direct {v13, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Constructor$2;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 32
    invoke-direct {v7, v9, v10, v12, v13}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 33
    invoke-virtual {v6, v7}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->setConstructor(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 34
    const-string v7, "id"

    .line 35
    new-instance v9, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    invoke-virtual {v6}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    move-result-object v10

    invoke-virtual {v10}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    move-result-object v10

    invoke-direct {v9, v10, v7}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 36
    new-instance v10, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const-string v12, "get"

    new-instance v13, Lexpo/modules/kotlin/types/AnyType;

    invoke-virtual {v9}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v14

    const/4 v15, 0x2

    move-object/from16 v21, v11

    const/4 v11, 0x0

    invoke-direct {v13, v14, v11, v15, v11}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v13}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v11

    .line 37
    invoke-virtual/range {v21 .. v21}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v13

    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v13, :cond_3

    new-instance v13, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-direct {v13, v14}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 38
    invoke-virtual/range {v21 .. v21}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v14

    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    invoke-interface {v14, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    :cond_3
    new-instance v14, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Property$1;

    invoke-direct {v14}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Property$1;-><init>()V

    .line 40
    invoke-direct {v10, v12, v11, v13, v14}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 41
    invoke-virtual {v9}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v11

    invoke-virtual {v10, v11}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    const/4 v11, 0x1

    .line 42
    invoke-virtual {v10, v11}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 43
    invoke-virtual {v9, v10}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 44
    invoke-virtual {v6}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    const-string v7, "getDetails"

    invoke-virtual {v6, v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v7

    .line 46
    new-instance v9, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v7}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v12

    .line 47
    new-instance v13, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-direct {v13, v14, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lexpo/modules/kotlin/types/AnyType;

    if-nez v13, :cond_4

    .line 49
    sget-object v13, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$1;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$1;

    .line 50
    new-instance v14, Lexpo/modules/kotlin/types/AnyType;

    .line 51
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    move-object/from16 v27, v5

    const/4 v5, 0x0

    invoke-direct {v15, v11, v5, v13}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 52
    invoke-direct {v14, v15, v12}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v13, v14

    goto :goto_2

    :cond_4
    move-object/from16 v27, v5

    .line 53
    :goto_2
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v5, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_5

    .line 55
    sget-object v5, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$2;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$2;

    .line 56
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 57
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v28, v4

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    move-object/from16 v34, v3

    const/4 v3, 0x1

    invoke-direct {v15, v4, v3, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 58
    invoke-direct {v11, v15, v12}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v11

    goto :goto_3

    :cond_5
    move-object/from16 v34, v3

    move-object/from16 v28, v4

    .line 59
    :goto_3
    filled-new-array {v13, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 60
    new-instance v4, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3;

    const/4 v11, 0x0

    invoke-direct {v4, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3;-><init>(Ln7/f;)V

    .line 61
    invoke-direct {v9, v10, v3, v4}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 62
    invoke-virtual {v7, v9}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 63
    const-string v3, "delete"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 64
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 65
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_6

    .line 67
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$4;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$4;

    .line 68
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 69
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 70
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 71
    :cond_6
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 72
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$5;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$5;-><init>(Ln7/f;)V

    .line 73
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 74
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 75
    const-string v3, "patch"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 76
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 77
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_7

    .line 79
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$6;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$6;

    .line 80
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 81
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 82
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 83
    :cond_7
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_8

    .line 85
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$7;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$7;

    .line 86
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 87
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x0

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 88
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 89
    :cond_8
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 90
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$8;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$8;-><init>(Ln7/f;)V

    .line 91
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 92
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 93
    const-string v3, "update"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 94
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 95
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_9

    .line 97
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$9;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$9;

    .line 98
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 99
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 100
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 101
    :cond_9
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_a

    .line 103
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$10;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$10;

    .line 104
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 105
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x0

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 106
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 107
    :cond_a
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 108
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$11;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$11;-><init>(Ln7/f;)V

    .line 109
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 110
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 111
    const-string v3, "getFullName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 112
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 113
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_b

    .line 115
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$12;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$12;

    .line 116
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 117
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 118
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 119
    :cond_b
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 120
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$13;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$13;-><init>(Ln7/f;)V

    .line 121
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 122
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 123
    const-string v3, "getGivenName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 124
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 125
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_c

    .line 127
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$14;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$14;

    .line 128
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 129
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 130
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 131
    :cond_c
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 132
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$15;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$15;-><init>(Ln7/f;)V

    .line 133
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 134
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 135
    const-string v3, "setGivenName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 136
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 137
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 138
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_d

    .line 139
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$16;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$16;

    .line 140
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 141
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 142
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 143
    :cond_d
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 144
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_e

    .line 145
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$17;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$17;

    .line 146
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 147
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 148
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 149
    :cond_e
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 150
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$18;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$18;-><init>(Ln7/f;)V

    .line 151
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 152
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 153
    const-string v3, "getFamilyName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 154
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 155
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_f

    .line 157
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$19;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$19;

    .line 158
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 159
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 160
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 161
    :cond_f
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 162
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$20;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$20;-><init>(Ln7/f;)V

    .line 163
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 164
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 165
    const-string v3, "setFamilyName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 166
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 167
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 168
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_10

    .line 169
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$21;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$21;

    .line 170
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 171
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 172
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 173
    :cond_10
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 174
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_11

    .line 175
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$22;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$22;

    .line 176
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 177
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 178
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 179
    :cond_11
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 180
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$23;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$23;-><init>(Ln7/f;)V

    .line 181
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 182
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 183
    const-string v3, "getMiddleName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 184
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 185
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 186
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_12

    .line 187
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$24;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$24;

    .line 188
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 189
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 190
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 191
    :cond_12
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 192
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$25;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$25;-><init>(Ln7/f;)V

    .line 193
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 194
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 195
    const-string v3, "setMiddleName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 196
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 197
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 198
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_13

    .line 199
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$26;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$26;

    .line 200
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 201
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 202
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 203
    :cond_13
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 204
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_14

    .line 205
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$27;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$27;

    .line 206
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 207
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 208
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 209
    :cond_14
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 210
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$28;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$28;-><init>(Ln7/f;)V

    .line 211
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 212
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 213
    const-string v3, "getPrefix"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 214
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 215
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 216
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_15

    .line 217
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$29;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$29;

    .line 218
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 219
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 220
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 221
    :cond_15
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 222
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$30;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$30;-><init>(Ln7/f;)V

    .line 223
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 224
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 225
    const-string v3, "setPrefix"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 226
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 227
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 228
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_16

    .line 229
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$31;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$31;

    .line 230
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 231
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 232
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 233
    :cond_16
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 234
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_17

    .line 235
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$32;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$32;

    .line 236
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 237
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 238
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 239
    :cond_17
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 240
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$33;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$33;-><init>(Ln7/f;)V

    .line 241
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 242
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 243
    const-string v3, "getSuffix"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 244
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 245
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 246
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_18

    .line 247
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$34;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$34;

    .line 248
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 249
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 250
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 251
    :cond_18
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 252
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$35;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$35;-><init>(Ln7/f;)V

    .line 253
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 254
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 255
    const-string v3, "setSuffix"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 256
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 257
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 258
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_19

    .line 259
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$36;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$36;

    .line 260
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 261
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 262
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 263
    :cond_19
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 264
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_1a

    .line 265
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$37;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$37;

    .line 266
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 267
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 268
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 269
    :cond_1a
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 270
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$38;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$38;-><init>(Ln7/f;)V

    .line 271
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 272
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 273
    const-string v3, "getPhoneticGivenName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 274
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 275
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 276
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_1b

    .line 277
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$39;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$39;

    .line 278
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 279
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 280
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 281
    :cond_1b
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 282
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$40;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$40;-><init>(Ln7/f;)V

    .line 283
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 284
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 285
    const-string v3, "setPhoneticGivenName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 286
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 287
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 288
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_1c

    .line 289
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$41;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$41;

    .line 290
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 291
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 292
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 293
    :cond_1c
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 294
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_1d

    .line 295
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$42;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$42;

    .line 296
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 297
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 298
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 299
    :cond_1d
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 300
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$43;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$43;-><init>(Ln7/f;)V

    .line 301
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 302
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 303
    const-string v3, "getPhoneticMiddleName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 304
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 305
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 306
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_1e

    .line 307
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$44;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$44;

    .line 308
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 309
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 310
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 311
    :cond_1e
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 312
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$45;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$45;-><init>(Ln7/f;)V

    .line 313
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 314
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 315
    const-string v3, "setPhoneticMiddleName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 316
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 317
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 318
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_1f

    .line 319
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$46;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$46;

    .line 320
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 321
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 322
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 323
    :cond_1f
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 324
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_20

    .line 325
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$47;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$47;

    .line 326
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 327
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 328
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 329
    :cond_20
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 330
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$48;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$48;-><init>(Ln7/f;)V

    .line 331
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 332
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 333
    const-string v3, "getPhoneticFamilyName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 334
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 335
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 336
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_21

    .line 337
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$49;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$49;

    .line 338
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 339
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 340
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 341
    :cond_21
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 342
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$50;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$50;-><init>(Ln7/f;)V

    .line 343
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 344
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 345
    const-string v3, "setPhoneticFamilyName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 346
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 347
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 348
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_22

    .line 349
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$51;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$51;

    .line 350
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 351
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 352
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 353
    :cond_22
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 354
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_23

    .line 355
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$52;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$52;

    .line 356
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 357
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 358
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 359
    :cond_23
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 360
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$53;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$53;-><init>(Ln7/f;)V

    .line 361
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 362
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 363
    const-string v3, "getCompany"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 364
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 365
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 366
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_24

    .line 367
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$54;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$54;

    .line 368
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 369
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 370
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 371
    :cond_24
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 372
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$55;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$55;-><init>(Ln7/f;)V

    .line 373
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 374
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 375
    const-string v3, "setCompany"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 376
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 377
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 378
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_25

    .line 379
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$56;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$56;

    .line 380
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 381
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 382
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 383
    :cond_25
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 384
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_26

    .line 385
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$57;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$57;

    .line 386
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 387
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 388
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 389
    :cond_26
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 390
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$58;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$58;-><init>(Ln7/f;)V

    .line 391
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 392
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 393
    const-string v3, "getDepartment"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 394
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 395
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 396
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_27

    .line 397
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$59;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$59;

    .line 398
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 399
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 400
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 401
    :cond_27
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 402
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$60;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$60;-><init>(Ln7/f;)V

    .line 403
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 404
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 405
    const-string v3, "setDepartment"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 406
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 407
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 408
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_28

    .line 409
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$61;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$61;

    .line 410
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 411
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 412
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 413
    :cond_28
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 414
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_29

    .line 415
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$62;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$62;

    .line 416
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 417
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 418
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 419
    :cond_29
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 420
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$63;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$63;-><init>(Ln7/f;)V

    .line 421
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 422
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 423
    const-string v3, "getJobTitle"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 424
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 425
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 426
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_2a

    .line 427
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$64;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$64;

    .line 428
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 429
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 430
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 431
    :cond_2a
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 432
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$65;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$65;-><init>(Ln7/f;)V

    .line 433
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 434
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 435
    const-string v3, "setJobTitle"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 436
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 437
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 438
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_2b

    .line 439
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$66;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$66;

    .line 440
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 441
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 442
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 443
    :cond_2b
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 444
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_2c

    .line 445
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$67;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$67;

    .line 446
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 447
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 448
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 449
    :cond_2c
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 450
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$68;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$68;-><init>(Ln7/f;)V

    .line 451
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 452
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 453
    const-string v3, "getPhoneticCompanyName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 454
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 455
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 456
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_2d

    .line 457
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$69;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$69;

    .line 458
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 459
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 460
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 461
    :cond_2d
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 462
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$70;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$70;-><init>(Ln7/f;)V

    .line 463
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 464
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 465
    const-string v3, "setPhoneticCompanyName"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 466
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 467
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 468
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_2e

    .line 469
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$71;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$71;

    .line 470
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 471
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 472
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 473
    :cond_2e
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 474
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_2f

    .line 475
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$72;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$72;

    .line 476
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 477
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 478
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 479
    :cond_2f
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 480
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$73;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$73;-><init>(Ln7/f;)V

    .line 481
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 482
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 483
    const-string v3, "getNote"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 484
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 485
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 486
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_30

    .line 487
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$74;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$74;

    .line 488
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 489
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 490
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 491
    :cond_30
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 492
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$75;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$75;-><init>(Ln7/f;)V

    .line 493
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 494
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 495
    const-string v3, "setNote"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 496
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 497
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 498
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_31

    .line 499
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$76;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$76;

    .line 500
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 501
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 502
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 503
    :cond_31
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 504
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_32

    .line 505
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$77;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$77;

    .line 506
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 507
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 508
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 509
    :cond_32
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 510
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$78;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$78;-><init>(Ln7/f;)V

    .line 511
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 512
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 513
    const-string v3, "getImage"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 514
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 515
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 516
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_33

    .line 517
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$79;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$79;

    .line 518
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 519
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 520
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 521
    :cond_33
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 522
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$80;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$80;-><init>(Ln7/f;)V

    .line 523
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 524
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 525
    const-string v3, "setImage"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 526
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 527
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 528
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_34

    .line 529
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$81;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$81;

    .line 530
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 531
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 532
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 533
    :cond_34
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 534
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_35

    .line 535
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$82;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$82;

    .line 536
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 537
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x1

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 538
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 539
    :cond_35
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 540
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$83;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$83;-><init>(Ln7/f;)V

    .line 541
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 542
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 543
    const-string v3, "getThumbnail"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 544
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 545
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 546
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_36

    .line 547
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$84;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$84;

    .line 548
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 549
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 550
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 551
    :cond_36
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 552
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$85;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$85;-><init>(Ln7/f;)V

    .line 553
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 554
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 555
    const-string v3, "setIsFavourite"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 556
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 557
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 558
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_37

    .line 559
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$86;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$86;

    .line 560
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 561
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 562
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 563
    :cond_37
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 564
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_38

    .line 565
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$87;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$87;

    .line 566
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 567
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x0

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 568
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 569
    :cond_38
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 570
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$88;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$88;-><init>(Ln7/f;)V

    .line 571
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 572
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 573
    const-string v3, "getIsFavourite"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 574
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 575
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 576
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_39

    .line 577
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$89;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$89;

    .line 578
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 579
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 580
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 581
    :cond_39
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 582
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$90;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$90;-><init>(Ln7/f;)V

    .line 583
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 584
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 585
    const-string v3, "getEmails"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 586
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 587
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 588
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_3a

    .line 589
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$91;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$91;

    .line 590
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 591
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 592
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 593
    :cond_3a
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 594
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$92;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$92;-><init>(Ln7/f;)V

    .line 595
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 596
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 597
    const-string v3, "addEmail"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 598
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 599
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 600
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_3b

    .line 601
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$93;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$93;

    .line 602
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 603
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 604
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 605
    :cond_3b
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 606
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_3c

    .line 607
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$94;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$94;

    .line 608
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 609
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x0

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 610
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 611
    :cond_3c
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 612
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$95;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$95;-><init>(Ln7/f;)V

    .line 613
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 614
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 615
    const-string v3, "updateEmail"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 616
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 617
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 618
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_3d

    .line 619
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$96;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$96;

    .line 620
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 621
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 622
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 623
    :cond_3d
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 624
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_3e

    .line 625
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$97;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$97;

    .line 626
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 627
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x0

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 628
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 629
    :cond_3e
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 630
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$98;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$98;-><init>(Ln7/f;)V

    .line 631
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 632
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 633
    const-string v3, "deleteEmail"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 634
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 635
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 636
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_3f

    .line 637
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$99;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$99;

    .line 638
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 639
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 640
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 641
    :cond_3f
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 642
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_40

    .line 643
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$100;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$100;

    .line 644
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 645
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x0

    invoke-direct {v12, v13, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 646
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 647
    :cond_40
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 648
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$101;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$101;-><init>(Ln7/f;)V

    .line 649
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 650
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 651
    const-string v3, "getPhones"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 652
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 653
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 654
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_41

    .line 655
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$102;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$102;

    .line 656
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 657
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 658
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 659
    :cond_41
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 660
    new-instance v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$103;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$103;-><init>(Ln7/f;)V

    .line 661
    invoke-direct {v4, v5, v7, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 662
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 663
    const-string v3, "addPhone"

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 664
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 665
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 666
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_42

    .line 667
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$104;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$104;

    .line 668
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 669
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 670
    invoke-direct {v10, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 671
    :cond_42
    new-instance v10, Lkotlin/Pair;

    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 672
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_43

    .line 673
    sget-object v10, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$105;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$105;

    .line 674
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 675
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v0

    const/4 v15, 0x0

    invoke-direct {v12, v0, v15, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 676
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    .line 677
    :cond_43
    filled-new-array {v9, v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v0

    .line 678
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$106;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$106;-><init>(Ln7/f;)V

    .line 679
    invoke-direct {v4, v5, v0, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 680
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 681
    const-string v0, "updatePhone"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 682
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 683
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 684
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_44

    .line 685
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$107;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$107;

    .line 686
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 687
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 688
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 689
    :cond_44
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 690
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_45

    .line 691
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$108;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$108;

    .line 692
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 693
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 694
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 695
    :cond_45
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 696
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$109;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$109;-><init>(Ln7/f;)V

    .line 697
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 698
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 699
    const-string v0, "deletePhone"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 700
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 701
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 702
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_46

    .line 703
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$110;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$110;

    .line 704
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 705
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 706
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 707
    :cond_46
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 708
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_47

    .line 709
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$111;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$111;

    .line 710
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 711
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 712
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 713
    :cond_47
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 714
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$112;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$112;-><init>(Ln7/f;)V

    .line 715
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 716
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 717
    const-string v0, "getAddresses"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 718
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 719
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 720
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_48

    .line 721
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$113;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$113;

    .line 722
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 723
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 724
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 725
    :cond_48
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 726
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$114;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$114;-><init>(Ln7/f;)V

    .line 727
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 728
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 729
    const-string v0, "addAddress"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 730
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 731
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 732
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_49

    .line 733
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$115;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$115;

    .line 734
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 735
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 736
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 737
    :cond_49
    new-instance v9, Lkotlin/Pair;

    const-class v10, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 738
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_4a

    .line 739
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$116;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$116;

    .line 740
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 741
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const-class v12, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 742
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 743
    :cond_4a
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 744
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$117;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$117;-><init>(Ln7/f;)V

    .line 745
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 746
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 747
    const-string v0, "updateAddress"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 748
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 749
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 750
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_4b

    .line 751
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$118;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$118;

    .line 752
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 753
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 754
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 755
    :cond_4b
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 756
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_4c

    .line 757
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$119;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$119;

    .line 758
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 759
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 760
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 761
    :cond_4c
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 762
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$120;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$120;-><init>(Ln7/f;)V

    .line 763
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 764
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 765
    const-string v0, "deleteAddress"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 766
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 767
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 768
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_4d

    .line 769
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$121;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$121;

    .line 770
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 771
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 772
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 773
    :cond_4d
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 774
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_4e

    .line 775
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$122;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$122;

    .line 776
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 777
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 778
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 779
    :cond_4e
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 780
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$123;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$123;-><init>(Ln7/f;)V

    .line 781
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 782
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 783
    const-string v0, "getDates"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 784
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 785
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 786
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_4f

    .line 787
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$124;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$124;

    .line 788
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 789
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 790
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 791
    :cond_4f
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 792
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$125;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$125;-><init>(Ln7/f;)V

    .line 793
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 794
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 795
    const-string v0, "addDate"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 796
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 797
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 798
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_50

    .line 799
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$126;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$126;

    .line 800
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 801
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 802
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 803
    :cond_50
    new-instance v9, Lkotlin/Pair;

    const-class v10, Lexpo/modules/contacts/next/records/fields/DateRecord$New;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 804
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_51

    .line 805
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$127;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$127;

    .line 806
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 807
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const-class v12, Lexpo/modules/contacts/next/records/fields/DateRecord$New;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 808
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 809
    :cond_51
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 810
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$128;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$128;-><init>(Ln7/f;)V

    .line 811
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 812
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 813
    const-string v0, "updateDate"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 814
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 815
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 816
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_52

    .line 817
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$129;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$129;

    .line 818
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 819
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 820
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 821
    :cond_52
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v33 .. v33}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 822
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_53

    .line 823
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$130;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$130;

    .line 824
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 825
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v33 .. v33}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 826
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 827
    :cond_53
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 828
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$131;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$131;-><init>(Ln7/f;)V

    .line 829
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 830
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 831
    const-string v0, "deleteDate"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 832
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 833
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 834
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_54

    .line 835
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$132;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$132;

    .line 836
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 837
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 838
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 839
    :cond_54
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v33 .. v33}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 840
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_55

    .line 841
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$133;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$133;

    .line 842
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 843
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v33 .. v33}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 844
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 845
    :cond_55
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 846
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$134;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$134;-><init>(Ln7/f;)V

    .line 847
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 848
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 849
    const-string v0, "getExtraNames"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 850
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 851
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 852
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_56

    .line 853
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$135;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$135;

    .line 854
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 855
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 856
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 857
    :cond_56
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 858
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$136;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$136;-><init>(Ln7/f;)V

    .line 859
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 860
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 861
    const-string v0, "addExtraName"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 862
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 863
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 864
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_57

    .line 865
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$137;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$137;

    .line 866
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 867
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 868
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 869
    :cond_57
    new-instance v9, Lkotlin/Pair;

    const-class v10, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 870
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_58

    .line 871
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$138;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$138;

    .line 872
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 873
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const-class v12, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 874
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 875
    :cond_58
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 876
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$139;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$139;-><init>(Ln7/f;)V

    .line 877
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 878
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 879
    const-string v0, "updateExtraName"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 880
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 881
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 882
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_59

    .line 883
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$140;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$140;

    .line 884
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 885
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 886
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 887
    :cond_59
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 888
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_5a

    .line 889
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$141;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$141;

    .line 890
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 891
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 892
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 893
    :cond_5a
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 894
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$142;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$142;-><init>(Ln7/f;)V

    .line 895
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 896
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 897
    const-string v0, "deleteExtraName"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 898
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 899
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 900
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_5b

    .line 901
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$143;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$143;

    .line 902
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 903
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 904
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 905
    :cond_5b
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 906
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_5c

    .line 907
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$144;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$144;

    .line 908
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 909
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 910
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 911
    :cond_5c
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 912
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$145;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$145;-><init>(Ln7/f;)V

    .line 913
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 914
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 915
    const-string v0, "getRelations"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 916
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 917
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 918
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_5d

    .line 919
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$146;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$146;

    .line 920
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 921
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 922
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 923
    :cond_5d
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 924
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$147;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$147;-><init>(Ln7/f;)V

    .line 925
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 926
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 927
    const-string v0, "addRelation"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 928
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 929
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 930
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_5e

    .line 931
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$148;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$148;

    .line 932
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 933
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 934
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 935
    :cond_5e
    new-instance v9, Lkotlin/Pair;

    const-class v10, Lexpo/modules/contacts/next/records/fields/RelationRecord$New;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 936
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_5f

    .line 937
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$149;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$149;

    .line 938
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 939
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const-class v12, Lexpo/modules/contacts/next/records/fields/RelationRecord$New;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 940
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 941
    :cond_5f
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 942
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$150;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$150;-><init>(Ln7/f;)V

    .line 943
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 944
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 945
    const-string v0, "updateRelation"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 946
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 947
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 948
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_60

    .line 949
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$151;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$151;

    .line 950
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 951
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 952
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 953
    :cond_60
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 954
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_61

    .line 955
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$152;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$152;

    .line 956
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 957
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 958
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 959
    :cond_61
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 960
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$153;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$153;-><init>(Ln7/f;)V

    .line 961
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 962
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 963
    const-string v0, "deleteRelation"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 964
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 965
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 966
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_62

    .line 967
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$154;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$154;

    .line 968
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 969
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 970
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 971
    :cond_62
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 972
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_63

    .line 973
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$155;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$155;

    .line 974
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 975
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 976
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 977
    :cond_63
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 978
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$156;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$156;-><init>(Ln7/f;)V

    .line 979
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 980
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 981
    const-string v0, "getUrlAddresses"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 982
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 983
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 984
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_64

    .line 985
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$157;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$157;

    .line 986
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 987
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 988
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 989
    :cond_64
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 990
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$158;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$158;-><init>(Ln7/f;)V

    .line 991
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 992
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 993
    const-string v0, "addUrlAddress"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 994
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 995
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 996
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_65

    .line 997
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$159;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$159;

    .line 998
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 999
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1000
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 1001
    :cond_65
    new-instance v9, Lkotlin/Pair;

    const-class v10, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1002
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_66

    .line 1003
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$160;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$160;

    .line 1004
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 1005
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const-class v12, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1006
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 1007
    :cond_66
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 1008
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$161;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$161;-><init>(Ln7/f;)V

    .line 1009
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 1010
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 1011
    const-string v0, "updateUrlAddress"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 1012
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 1013
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1014
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_67

    .line 1015
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$162;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$162;

    .line 1016
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 1017
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1018
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 1019
    :cond_67
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1020
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_68

    .line 1021
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$163;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$163;

    .line 1022
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 1023
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1024
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 1025
    :cond_68
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 1026
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$164;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$164;-><init>(Ln7/f;)V

    .line 1027
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 1028
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 1029
    const-string v0, "deleteUrlAddress"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 1030
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 1031
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1032
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_69

    .line 1033
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$165;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$165;

    .line 1034
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 1035
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1036
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 1037
    :cond_69
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1038
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_6a

    .line 1039
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$166;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$166;

    .line 1040
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 1041
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1042
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 1043
    :cond_6a
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 1044
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$167;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$167;-><init>(Ln7/f;)V

    .line 1045
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 1046
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 1047
    const-string v0, "editWithForm"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 1048
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 1049
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1050
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_6b

    .line 1051
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$168;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$168;

    .line 1052
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 1053
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1054
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 1055
    :cond_6b
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 1056
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169;

    const/4 v11, 0x0

    invoke-direct {v7, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169;-><init>(Ln7/f;)V

    .line 1057
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 1058
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 1059
    const-string v0, "create"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->StaticAsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 1060
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 1061
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1062
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_6c

    .line 1063
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$170;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$170;

    .line 1064
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 1065
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1066
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 1067
    :cond_6c
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 1068
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;

    const/4 v11, 0x0

    invoke-direct {v7, v11, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171;-><init>(Ln7/f;Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 1069
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 1070
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 1071
    const-string v0, "presentCreateForm"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->StaticAsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 1072
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 1073
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1074
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_6d

    .line 1075
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$172;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$172;

    .line 1076
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 1077
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x1

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1078
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 1079
    :cond_6d
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 1080
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173;

    const/4 v11, 0x0

    invoke-direct {v7, v11, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173;-><init>(Ln7/f;Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 1081
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 1082
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 1083
    const-string v0, "presentPicker"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->StaticAsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 1084
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    const/4 v15, 0x0

    new-array v5, v15, [Lexpo/modules/kotlin/types/AnyType;

    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$174;

    const/4 v11, 0x0

    invoke-direct {v7, v11, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$174;-><init>(Ln7/f;Lexpo/modules/contacts/next/ContactsNextModule;)V

    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 1085
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 1086
    const-string v0, "getAll"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->StaticAsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 1087
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 1088
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1089
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_6e

    .line 1090
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$175;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$175;

    .line 1091
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 1092
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x1

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1093
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 1094
    :cond_6e
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 1095
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$176;

    const/4 v11, 0x0

    invoke-direct {v7, v11, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$176;-><init>(Ln7/f;Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 1096
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 1097
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 1098
    const-string v0, "getAllDetails"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->StaticAsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 1099
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 1100
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1101
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_6f

    .line 1102
    sget-object v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$177;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$177;

    .line 1103
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 1104
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1105
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 1106
    :cond_6f
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1107
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_70

    .line 1108
    sget-object v9, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$178;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$178;

    .line 1109
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 1110
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x1

    invoke-direct {v11, v12, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1111
    invoke-direct {v10, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 1112
    :cond_70
    filled-new-array {v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 1113
    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;

    const/4 v11, 0x0

    invoke-direct {v7, v11, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179;-><init>(Ln7/f;Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 1114
    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 1115
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 1116
    const-string v0, "getCount"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->StaticAsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 1117
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    const/4 v15, 0x0

    new-array v5, v15, [Lexpo/modules/kotlin/types/AnyType;

    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$180;

    const/4 v11, 0x0

    invoke-direct {v7, v11, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$180;-><init>(Ln7/f;Lexpo/modules/contacts/next/ContactsNextModule;)V

    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 1118
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 1119
    const-string v0, "hasAny"

    invoke-virtual {v6, v0}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->StaticAsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 1120
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    const/4 v15, 0x0

    new-array v5, v15, [Lexpo/modules/kotlin/types/AnyType;

    new-instance v7, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$181;

    const/4 v11, 0x0

    invoke-direct {v7, v11, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$181;-><init>(Ln7/f;Lexpo/modules/contacts/next/ContactsNextModule;)V

    invoke-direct {v3, v4, v5, v7}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 1121
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 1122
    const-string v0, "requestPermissionsAsync"

    .line 1123
    invoke-static {v2, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_71

    .line 1124
    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    const/4 v15, 0x0

    new-array v4, v15, [Lexpo/modules/kotlin/types/AnyType;

    .line 1125
    new-instance v5, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$1;

    invoke-direct {v5, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$1;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 1126
    invoke-direct {v3, v0, v4, v5}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    :goto_4
    move-object/from16 v7, v34

    goto/16 :goto_7

    .line 1127
    :cond_71
    invoke-virtual {v6}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 1128
    new-instance v4, Lkotlin/Pair;

    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1129
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_72

    .line 1130
    sget-object v4, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$2;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$2;

    .line 1131
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 1132
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x0

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1133
    invoke-direct {v5, v7, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 1134
    :cond_72
    filled-new-array {v4}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 1135
    new-instance v4, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$3;

    invoke-direct {v4, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$3;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 1136
    const-class v5, Li7/B;

    .line 1137
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_73

    .line 1138
    new-instance v5, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v5, v0, v3, v4}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_5
    move-object v3, v5

    goto :goto_4

    .line 1139
    :cond_73
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_74

    .line 1140
    new-instance v5, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v5, v0, v3, v4}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_5

    .line 1141
    :cond_74
    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_75

    .line 1142
    new-instance v5, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v5, v0, v3, v4}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_5

    .line 1143
    :cond_75
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_76

    .line 1144
    new-instance v5, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v5, v0, v3, v4}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_5

    :cond_76
    move-object/from16 v7, v34

    .line 1145
    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_77

    .line 1146
    new-instance v5, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v5, v0, v3, v4}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_6
    move-object v3, v5

    goto :goto_7

    .line 1147
    :cond_77
    new-instance v5, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v5, v0, v3, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 1148
    :goto_7
    invoke-virtual {v6}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getStaticAsyncFunctions()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1149
    const-string v0, "getPermissions"

    .line 1150
    invoke-static {v2, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_78

    .line 1151
    new-instance v2, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    const/4 v15, 0x0

    new-array v3, v15, [Lexpo/modules/kotlin/types/AnyType;

    .line 1152
    new-instance v4, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$4;

    invoke-direct {v4, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$4;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 1153
    invoke-direct {v2, v0, v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    goto/16 :goto_9

    .line 1154
    :cond_78
    invoke-virtual {v6}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 1155
    new-instance v4, Lkotlin/Pair;

    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1156
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_79

    .line 1157
    sget-object v4, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$5;->INSTANCE:Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$5;

    .line 1158
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 1159
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    const/4 v15, 0x0

    invoke-direct {v8, v2, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1160
    invoke-direct {v5, v8, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 1161
    :cond_79
    filled-new-array {v4}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 1162
    new-instance v3, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$6;

    invoke-direct {v3, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$6;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    .line 1163
    const-class v4, Li7/B;

    .line 1164
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7a

    .line 1165
    new-instance v4, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_8
    move-object v2, v4

    goto :goto_9

    .line 1166
    :cond_7a
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7b

    .line 1167
    new-instance v4, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 1168
    :cond_7b
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7c

    .line 1169
    new-instance v4, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 1170
    :cond_7c
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7d

    .line 1171
    new-instance v4, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 1172
    :cond_7d
    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7e

    .line 1173
    new-instance v4, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 1174
    :cond_7e
    new-instance v4, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 1175
    :goto_9
    invoke-virtual {v6}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getStaticAsyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1176
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getClassData()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->buildClass()Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1177
    filled-new-array/range {v27 .. v27}, [Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v28

    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->Events([Ljava/lang/String;)V

    .line 1178
    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    move-result-object v0

    sget-object v3, Lexpo/modules/kotlin/events/EventName;->MODULE_DESTROY:Lexpo/modules/kotlin/events/EventName;

    new-instance v4, Lexpo/modules/kotlin/events/BasicEventListener;

    new-instance v5, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$$inlined$OnDestroy$1;

    invoke-direct {v5, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$lambda$86$$inlined$OnDestroy$1;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    invoke-direct {v4, v3, v5}, Lexpo/modules/kotlin/events/BasicEventListener;-><init>(Lexpo/modules/kotlin/events/EventName;Lw7/a;)V

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1179
    new-instance v0, Lexpo/modules/contacts/next/ContactsNextModule$definition$1$3;

    invoke-direct {v0, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$1$3;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    move-object/from16 v3, v27

    invoke-virtual {v2, v3, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->OnStartObserving(Ljava/lang/String;Lw7/a;)V

    .line 1180
    new-instance v0, Lexpo/modules/contacts/next/ContactsNextModule$definition$1$4;

    invoke-direct {v0, v1}, Lexpo/modules/contacts/next/ContactsNextModule$definition$1$4;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;)V

    invoke-virtual {v2, v3, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->OnStopObserving(Ljava/lang/String;Lw7/a;)V

    .line 1181
    new-instance v0, Lexpo/modules/contacts/next/ContactsNextModule$definition$1$5;

    const/4 v11, 0x0

    invoke-direct {v0, v1, v11}, Lexpo/modules/contacts/next/ContactsNextModule$definition$1$5;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;Ln7/f;)V

    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->RegisterActivityContracts(Lkotlin/jvm/functions/Function2;)V

    .line 1182
    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1183
    invoke-static {}, Ll1/a;->f()V

    return-object v0

    .line 1184
    :cond_7f
    :try_start_1
    const-string v0, "Required value was null."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1185
    :goto_a
    invoke-static {}, Ll1/a;->f()V

    throw v0
.end method
