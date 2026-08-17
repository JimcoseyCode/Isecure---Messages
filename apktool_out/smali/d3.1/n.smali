.class public Ld3/n;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ld3/m;


# instance fields
.field private final g:I

.field private final h:I

.field private final i:I

.field private final j:Ld3/p;

.field private final k:Ljava/util/Map;


# direct methods
.method public constructor <init>(IIILd3/p;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ld3/n;->g:I

    .line 5
    .line 6
    iput p2, p0, Ld3/n;->h:I

    .line 7
    .line 8
    iput p3, p0, Ld3/n;->i:I

    .line 9
    .line 10
    iput-object p4, p0, Ld3/n;->j:Ld3/p;

    .line 11
    .line 12
    iput-object p5, p0, Ld3/n;->k:Ljava/util/Map;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public getExtras()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/n;->k:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Ld3/n;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Ld3/n;->g:I

    .line 2
    .line 3
    return v0
.end method
