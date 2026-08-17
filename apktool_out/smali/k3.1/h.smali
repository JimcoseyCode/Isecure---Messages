.class public Lk3/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lk3/d;


# instance fields
.field private final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lk3/h;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public createImageTranscoder(LQ2/c;Z)Lk3/c;
    .locals 1

    .line 1
    new-instance p1, Lk3/g;

    .line 2
    .line 3
    iget v0, p0, Lk3/h;->a:I

    .line 4
    .line 5
    invoke-direct {p1, p2, v0}, Lk3/g;-><init>(ZI)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method
