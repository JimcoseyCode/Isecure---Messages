.class public Lf6/a$d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private final a:Lf6/a$h;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/List;

.field private final e:Ljava/util/List;

.field private final f:Ljava/util/List;

.field private final g:Ljava/util/List;


# direct methods
.method public constructor <init>(Lf6/a$h;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf6/a$d;->a:Lf6/a$h;

    .line 5
    .line 6
    iput-object p2, p0, Lf6/a$d;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lf6/a$d;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lf6/a$d;->d:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Lf6/a$d;->e:Ljava/util/List;

    .line 13
    .line 14
    iput-object p6, p0, Lf6/a$d;->f:Ljava/util/List;

    .line 15
    .line 16
    iput-object p7, p0, Lf6/a$d;->g:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a$d;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a$d;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Lf6/a$h;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a$d;->a:Lf6/a$h;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a$d;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a$d;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a$d;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a$d;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
