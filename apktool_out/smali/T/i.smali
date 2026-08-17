.class public LT/i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/D1;
.implements LF/E0;
.implements LK/r;


# static fields
.field static final Q:LF/j0$a;


# instance fields
.field private final P:LF/X0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "camerax.core.streamSharing.captureTypes"

    .line 2
    .line 3
    const-class v1, Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LT/i;->Q:LF/j0$a;

    .line 10
    .line 11
    return-void
.end method

.method constructor <init>(LF/X0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT/i;->P:LF/X0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public f0()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, LT/i;->Q:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LF/h1;->d(LF/j0$a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
.end method

.method public o()LF/j0;
    .locals 1

    .line 1
    iget-object v0, p0, LT/i;->P:LF/X0;

    .line 2
    .line 3
    return-object v0
.end method
