.class final Lm0/a$a;
.super Ljava/util/AbstractSet;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic g:Lm0/a;


# direct methods
.method constructor <init>(Lm0/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/a$a;->g:Lm0/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lm0/a$d;

    .line 2
    .line 3
    iget-object v1, p0, Lm0/a$a;->g:Lm0/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lm0/a$d;-><init>(Lm0/a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/a$a;->g:Lm0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm0/i;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
