.class public final Landroidx/core/app/t$e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/Set;

.field private final c:Landroid/os/Bundle;

.field private d:Ljava/lang/CharSequence;

.field private e:[Ljava/lang/CharSequence;

.field private f:Z

.field private g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/core/app/t$e;->b:Ljava/util/Set;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/core/app/t$e;->c:Landroid/os/Bundle;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Landroidx/core/app/t$e;->f:Z

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput v0, p0, Landroidx/core/app/t$e;->g:I

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iput-object p1, p0, Landroidx/core/app/t$e;->a:Ljava/lang/String;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    const-string v0, "Result key can\'t be null"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1
.end method


# virtual methods
.method public a()Landroidx/core/app/t;
    .locals 8

    .line 1
    new-instance v0, Landroidx/core/app/t;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/core/app/t$e;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/core/app/t$e;->d:Ljava/lang/CharSequence;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/core/app/t$e;->e:[Ljava/lang/CharSequence;

    .line 8
    .line 9
    iget-boolean v4, p0, Landroidx/core/app/t$e;->f:Z

    .line 10
    .line 11
    iget v5, p0, Landroidx/core/app/t$e;->g:I

    .line 12
    .line 13
    iget-object v6, p0, Landroidx/core/app/t$e;->c:Landroid/os/Bundle;

    .line 14
    .line 15
    iget-object v7, p0, Landroidx/core/app/t$e;->b:Ljava/util/Set;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, Landroidx/core/app/t;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZILandroid/os/Bundle;Ljava/util/Set;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public b(Ljava/lang/CharSequence;)Landroidx/core/app/t$e;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/core/app/t$e;->d:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object p0
.end method
