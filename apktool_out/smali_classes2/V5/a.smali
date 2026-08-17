.class public final LV5/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final i:LV5/a;


# instance fields
.field private final a:LW5/b;

.field private final b:LT5/b;

.field private final c:LX5/l;

.field private final d:LX5/h;

.field private final e:LX5/l;

.field private final f:LX5/m;

.field private final g:LX5/l;

.field private final h:LX5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LV5/a;

    .line 2
    .line 3
    invoke-direct {v0}, LV5/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LV5/a;->i:LV5/a;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LW5/b;->c()LW5/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LV5/a;->a:LW5/b;

    .line 9
    .line 10
    new-instance v1, LW5/a;

    .line 11
    .line 12
    invoke-direct {v1}, LW5/a;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, LV5/a;->b:LT5/b;

    .line 16
    .line 17
    new-instance v2, LX5/j;

    .line 18
    .line 19
    const-string v3, "/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto"

    .line 20
    .line 21
    invoke-direct {v2, v3}, LX5/j;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, LV5/a;->c:LX5/l;

    .line 25
    .line 26
    new-instance v3, LX5/i;

    .line 27
    .line 28
    invoke-direct {v3, v2, v1, v0}, LX5/i;-><init>(LX5/l;LT5/b;LW5/b;)V

    .line 29
    .line 30
    .line 31
    iput-object v3, p0, LV5/a;->d:LX5/h;

    .line 32
    .line 33
    new-instance v2, LX5/j;

    .line 34
    .line 35
    const-string v3, "/com/google/i18n/phonenumbers/data/ShortNumberMetadataProto"

    .line 36
    .line 37
    invoke-direct {v2, v3}, LX5/j;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, LV5/a;->e:LX5/l;

    .line 41
    .line 42
    new-instance v3, LX5/n;

    .line 43
    .line 44
    invoke-direct {v3, v2, v1, v0}, LX5/n;-><init>(LX5/l;LT5/b;LW5/b;)V

    .line 45
    .line 46
    .line 47
    iput-object v3, p0, LV5/a;->f:LX5/m;

    .line 48
    .line 49
    new-instance v2, LX5/j;

    .line 50
    .line 51
    const-string v3, "/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto"

    .line 52
    .line 53
    invoke-direct {v2, v3}, LX5/j;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, LV5/a;->g:LX5/l;

    .line 57
    .line 58
    new-instance v3, LX5/d;

    .line 59
    .line 60
    invoke-direct {v3, v2, v1, v0}, LX5/d;-><init>(LX5/l;LT5/b;LW5/b;)V

    .line 61
    .line 62
    .line 63
    iput-object v3, p0, LV5/a;->h:LX5/c;

    .line 64
    .line 65
    return-void
.end method

.method public static a()LV5/a;
    .locals 1

    .line 1
    sget-object v0, LV5/a;->i:LV5/a;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public b()LT5/b;
    .locals 1

    .line 1
    iget-object v0, p0, LV5/a;->b:LT5/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()LW5/b;
    .locals 1

    .line 1
    iget-object v0, p0, LV5/a;->a:LW5/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()LX5/l;
    .locals 1

    .line 1
    iget-object v0, p0, LV5/a;->c:LX5/l;

    .line 2
    .line 3
    return-object v0
.end method
