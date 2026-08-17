.class public final LG4/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private a:I

.field private final b:LG4/h;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LG4/h;->g:LG4/h;

    .line 5
    .line 6
    iput-object v0, p0, LG4/e;->b:LG4/h;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(I)LG4/e;
    .locals 0

    .line 1
    iput p1, p0, LG4/e;->a:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()LG4/i;
    .locals 3

    .line 1
    new-instance v0, LG4/d;

    .line 2
    .line 3
    iget v1, p0, LG4/e;->a:I

    .line 4
    .line 5
    iget-object v2, p0, LG4/e;->b:LG4/h;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LG4/d;-><init>(ILG4/h;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
