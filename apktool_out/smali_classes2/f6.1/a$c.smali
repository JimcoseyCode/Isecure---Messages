.class public Lf6/a$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Lf6/a$b;

.field private final g:Lf6/a$b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lf6/a$b;Lf6/a$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf6/a$c;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lf6/a$c;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lf6/a$c;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lf6/a$c;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lf6/a$c;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lf6/a$c;->f:Lf6/a$b;

    .line 15
    .line 16
    iput-object p7, p0, Lf6/a$c;->g:Lf6/a$b;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a$c;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lf6/a$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a$c;->g:Lf6/a$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a$c;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Lf6/a$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a$c;->f:Lf6/a$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a$c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
