.class final LO8/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LO8/i;
.implements LO8/c;


# static fields
.field public static final a:LO8/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LO8/e;

    .line 2
    .line 3
    invoke-direct {v0}, LO8/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LO8/e;->a:LO8/e;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(I)LO8/i;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO8/e;->d(I)LO8/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(I)LO8/i;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO8/e;->c(I)LO8/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(I)LO8/e;
    .locals 0

    .line 1
    sget-object p1, LO8/e;->a:LO8/e;

    .line 2
    .line 3
    return-object p1
.end method

.method public d(I)LO8/e;
    .locals 0

    .line 1
    sget-object p1, LO8/e;->a:LO8/e;

    .line 2
    .line 3
    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    sget-object v0, Lj7/C;->g:Lj7/C;

    .line 2
    .line 3
    return-object v0
.end method
