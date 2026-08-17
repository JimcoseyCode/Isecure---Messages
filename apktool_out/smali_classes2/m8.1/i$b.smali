.class public abstract Lm8/i$b;
.super Lm8/a$a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field private g:Lm8/d;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lm8/a$a;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lm8/d;->g:Lm8/d;

    .line 5
    .line 6
    iput-object v0, p0, Lm8/i$b;->g:Lm8/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final i()Lm8/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/i$b;->g:Lm8/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract j(Lm8/i;)Lm8/i$b;
.end method

.method public final k(Lm8/d;)Lm8/i$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lm8/i$b;->g:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method
